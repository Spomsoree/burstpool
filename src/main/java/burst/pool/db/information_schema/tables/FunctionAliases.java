/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.information_schema.tables;


import burst.pool.db.information_schema.InformationSchema;
import burst.pool.db.information_schema.tables.records.FunctionAliasesRecord;

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
public class FunctionAliases extends TableImpl<FunctionAliasesRecord> {

    private static final long serialVersionUID = -1935499854;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code>
     */
    public static final FunctionAliases FUNCTION_ALIASES = new FunctionAliases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FunctionAliasesRecord> getRecordType() {
        return FunctionAliasesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
     */
    public final TableField<FunctionAliasesRecord, String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
     */
    public final TableField<FunctionAliasesRecord, String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
     */
    public final TableField<FunctionAliasesRecord, String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
     */
    public final TableField<FunctionAliasesRecord, String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
     */
    public final TableField<FunctionAliasesRecord, String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
     */
    public final TableField<FunctionAliasesRecord, Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
     */
    public final TableField<FunctionAliasesRecord, String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
     */
    public final TableField<FunctionAliasesRecord, Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
     */
    public final TableField<FunctionAliasesRecord, Short> RETURNS_RESULT = createField("RETURNS_RESULT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
     */
    public final TableField<FunctionAliasesRecord, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
     */
    public final TableField<FunctionAliasesRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
     */
    public final TableField<FunctionAliasesRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code> table reference
     */
    public FunctionAliases() {
        this(DSL.name("FUNCTION_ALIASES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code> table reference
     */
    public FunctionAliases(String alias) {
        this(DSL.name(alias), FUNCTION_ALIASES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code> table reference
     */
    public FunctionAliases(Name alias) {
        this(alias, FUNCTION_ALIASES);
    }

    private FunctionAliases(Name alias, Table<FunctionAliasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FunctionAliases(Name alias, Table<FunctionAliasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FunctionAliases(Table<O> child, ForeignKey<O, FunctionAliasesRecord> key) {
        super(child, key, FUNCTION_ALIASES);
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
    public FunctionAliases as(String alias) {
        return new FunctionAliases(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionAliases as(Name alias) {
        return new FunctionAliases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionAliases rename(String name) {
        return new FunctionAliases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionAliases rename(Name name) {
        return new FunctionAliases(name, null);
    }
}
