package burst.pool.brs;

import burst.kit.entity.response.MiningInfoResponse;
import burst.pool.pool.Submission;
import burst.pool.pool.SubmissionException;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public class Generator {

    public static int calculateScoop(byte[] genSig, long height) {
        ByteBuffer posbuf = ByteBuffer.allocate(32 + 8);
        posbuf.put(genSig);
        posbuf.putLong(height);

        Shabal256 md = new Shabal256();
        md.update(posbuf.array());
        BigInteger hashnum = new BigInteger(1, md.digest());
        return hashnum.mod(BigInteger.valueOf(MiningPlot.SCOOPS_PER_PLOT)).intValue();
    }

    public static BigInteger calculateHit(long accountId, long nonce, byte[] genSig, int scoop, int blockHeight) {
        MiningPlot plot = new MiningPlot(accountId, nonce, blockHeight);
        Shabal256 md = new Shabal256();
        md.update(genSig);
        plot.hashScoop(md, scoop);
        byte[] hash = md.digest();
        return new BigInteger(1, new byte[] { hash[7], hash[6], hash[5], hash[4], hash[3], hash[2], hash[1], hash[0] });
    }

    public static BigInteger calculateDeadline(long accountId, long nonce, byte[] genSig, int scoop, long baseTarget, int blockHeight) {
        BigInteger hit = calculateHit(accountId, nonce, genSig, scoop, blockHeight);
        return hit.divide(BigInteger.valueOf(baseTarget));
    }

    public static BigInteger calcDeadline(MiningInfoResponse miningInfo, Submission submission) throws SubmissionException {
        MiningInfoResponse mMiningInfo = miningInfo;
        if (mMiningInfo == null) {
            throw new SubmissionException("Pool does not have mining info");
        }
        return calculateDeadline(submission.getMiner().getBurstID().getSignedLongId(), parseUnsignedLong(submission.getNonce()), mMiningInfo.getGenerationSignature().getBytes(), calculateScoop(mMiningInfo.getGenerationSignature().getBytes(), mMiningInfo.getHeight()), mMiningInfo.getBaseTarget(), Math.toIntExact(mMiningInfo.getHeight())); // todo height -> long
    }

    private static long parseUnsignedLong(String number) {
        if (number == null) {
            return 0;
        }
        BigInteger bigInt = new BigInteger(number.trim());
        if (bigInt.signum() < 0 || bigInt.compareTo(new BigInteger("18446744073709551616")) > -1) {
            throw new IllegalArgumentException("overflow: " + number);
        }
        return bigInt.longValue();
    }
}