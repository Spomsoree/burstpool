/*
 * This file is generated by jOOQ.
 */
package burst.pool.db;


import burst.pool.db.burstpool.Burstpool;
import burst.pool.db.information_schema.InformationSchema;
import burst.pool.db.public_.Public;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -131241772;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>BURSTPOOL</code>.
     */
    public final Burstpool BURSTPOOL = burst.pool.db.burstpool.Burstpool.BURSTPOOL;

    /**
     * The schema <code>INFORMATION_SCHEMA</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = burst.pool.db.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>PUBLIC</code>.
     */
    public final Public PUBLIC = burst.pool.db.public_.Public.PUBLIC;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            Burstpool.BURSTPOOL,
            InformationSchema.INFORMATION_SCHEMA,
            Public.PUBLIC);
    }
}
