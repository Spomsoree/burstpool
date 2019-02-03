/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.information_schema.tables;


import burst.pool.db.information_schema.InformationSchema;
import burst.pool.db.information_schema.tables.records.RightsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Rights extends TableImpl<RightsRecord> {

    private static final long serialVersionUID = -1426805040;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.RIGHTS</code>
     */
    public static final Rights RIGHTS = new Rights();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RightsRecord> getRecordType() {
        return RightsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.GRANTEE</code>.
     */
    public final TableField<RightsRecord, String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.GRANTEETYPE</code>.
     */
    public final TableField<RightsRecord, String> GRANTEETYPE = createField("GRANTEETYPE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.GRANTEDROLE</code>.
     */
    public final TableField<RightsRecord, String> GRANTEDROLE = createField("GRANTEDROLE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.RIGHTS</code>.
     */
    public final TableField<RightsRecord, String> RIGHTS_ = createField("RIGHTS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.TABLE_SCHEMA</code>.
     */
    public final TableField<RightsRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.TABLE_NAME</code>.
     */
    public final TableField<RightsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.RIGHTS.ID</code>.
     */
    public final TableField<RightsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.RIGHTS</code> table reference
     */
    public Rights() {
        this(DSL.name("RIGHTS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.RIGHTS</code> table reference
     */
    public Rights(String alias) {
        this(DSL.name(alias), RIGHTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.RIGHTS</code> table reference
     */
    public Rights(Name alias) {
        this(alias, RIGHTS);
    }

    private Rights(Name alias, Table<RightsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rights(Name alias, Table<RightsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rights(Table<O> child, ForeignKey<O, RightsRecord> key) {
        super(child, key, RIGHTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rights as(String alias) {
        return new Rights(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rights as(Name alias) {
        return new Rights(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rights rename(String name) {
        return new Rights(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rights rename(Name name) {
        return new Rights(name, null);
    }
}
