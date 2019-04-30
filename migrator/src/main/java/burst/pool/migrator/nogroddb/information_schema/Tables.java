/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema;


import burst.pool.migrator.nogroddb.information_schema.tables.AllPlugins;
import burst.pool.migrator.nogroddb.information_schema.tables.ApplicableRoles;
import burst.pool.migrator.nogroddb.information_schema.tables.CharacterSets;
import burst.pool.migrator.nogroddb.information_schema.tables.CheckConstraints;
import burst.pool.migrator.nogroddb.information_schema.tables.ClientStatistics;
import burst.pool.migrator.nogroddb.information_schema.tables.CollationCharacterSetApplicability;
import burst.pool.migrator.nogroddb.information_schema.tables.Collations;
import burst.pool.migrator.nogroddb.information_schema.tables.ColumnPrivileges;
import burst.pool.migrator.nogroddb.information_schema.tables.Columns;
import burst.pool.migrator.nogroddb.information_schema.tables.EnabledRoles;
import burst.pool.migrator.nogroddb.information_schema.tables.Engines;
import burst.pool.migrator.nogroddb.information_schema.tables.Events;
import burst.pool.migrator.nogroddb.information_schema.tables.Files;
import burst.pool.migrator.nogroddb.information_schema.tables.GeometryColumns;
import burst.pool.migrator.nogroddb.information_schema.tables.GlobalStatus;
import burst.pool.migrator.nogroddb.information_schema.tables.GlobalVariables;
import burst.pool.migrator.nogroddb.information_schema.tables.IndexStatistics;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPage;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPageLru;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPoolStats;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmp;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpPerIndex;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpPerIndexReset;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpReset;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpmem;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpmemReset;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtBeingDeleted;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtConfig;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtDefaultStopword;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtDeleted;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtIndexCache;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtIndexTable;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbLockWaits;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbLocks;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbMetrics;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbMutexes;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysColumns;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysDatafiles;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysFields;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysForeign;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysForeignCols;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysIndexes;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysSemaphoreWaits;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTables;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTablespaces;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTablestats;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysVirtual;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbTablespacesEncryption;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbTablespacesScrubbing;
import burst.pool.migrator.nogroddb.information_schema.tables.InnodbTrx;
import burst.pool.migrator.nogroddb.information_schema.tables.KeyCaches;
import burst.pool.migrator.nogroddb.information_schema.tables.KeyColumnUsage;
import burst.pool.migrator.nogroddb.information_schema.tables.Parameters;
import burst.pool.migrator.nogroddb.information_schema.tables.Partitions;
import burst.pool.migrator.nogroddb.information_schema.tables.Plugins;
import burst.pool.migrator.nogroddb.information_schema.tables.Processlist;
import burst.pool.migrator.nogroddb.information_schema.tables.Profiling;
import burst.pool.migrator.nogroddb.information_schema.tables.ReferentialConstraints;
import burst.pool.migrator.nogroddb.information_schema.tables.Routines;
import burst.pool.migrator.nogroddb.information_schema.tables.SchemaPrivileges;
import burst.pool.migrator.nogroddb.information_schema.tables.Schemata;
import burst.pool.migrator.nogroddb.information_schema.tables.SessionStatus;
import burst.pool.migrator.nogroddb.information_schema.tables.SessionVariables;
import burst.pool.migrator.nogroddb.information_schema.tables.SpatialRefSys;
import burst.pool.migrator.nogroddb.information_schema.tables.Statistics;
import burst.pool.migrator.nogroddb.information_schema.tables.SystemVariables;
import burst.pool.migrator.nogroddb.information_schema.tables.TableConstraints;
import burst.pool.migrator.nogroddb.information_schema.tables.TablePrivileges;
import burst.pool.migrator.nogroddb.information_schema.tables.TableStatistics;
import burst.pool.migrator.nogroddb.information_schema.tables.Tablespaces;
import burst.pool.migrator.nogroddb.information_schema.tables.Triggers;
import burst.pool.migrator.nogroddb.information_schema.tables.UserPrivileges;
import burst.pool.migrator.nogroddb.information_schema.tables.UserStatistics;
import burst.pool.migrator.nogroddb.information_schema.tables.UserVariables;
import burst.pool.migrator.nogroddb.information_schema.tables.Views;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema.ALL_PLUGINS</code>.
     */
    public static final AllPlugins ALL_PLUGINS = burst.pool.migrator.nogroddb.information_schema.tables.AllPlugins.ALL_PLUGINS;

    /**
     * The table <code>information_schema.APPLICABLE_ROLES</code>.
     */
    public static final ApplicableRoles APPLICABLE_ROLES = burst.pool.migrator.nogroddb.information_schema.tables.ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public static final CharacterSets CHARACTER_SETS = burst.pool.migrator.nogroddb.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.CHECK_CONSTRAINTS</code>.
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = burst.pool.migrator.nogroddb.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>information_schema.CLIENT_STATISTICS</code>.
     */
    public static final ClientStatistics CLIENT_STATISTICS = burst.pool.migrator.nogroddb.information_schema.tables.ClientStatistics.CLIENT_STATISTICS;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public static final Collations COLLATIONS = burst.pool.migrator.nogroddb.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = burst.pool.migrator.nogroddb.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public static final Columns COLUMNS = burst.pool.migrator.nogroddb.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = burst.pool.migrator.nogroddb.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.ENABLED_ROLES</code>.
     */
    public static final EnabledRoles ENABLED_ROLES = burst.pool.migrator.nogroddb.information_schema.tables.EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public static final Engines ENGINES = burst.pool.migrator.nogroddb.information_schema.tables.Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public static final Events EVENTS = burst.pool.migrator.nogroddb.information_schema.tables.Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public static final Files FILES = burst.pool.migrator.nogroddb.information_schema.tables.Files.FILES;

    /**
     * The table <code>information_schema.GEOMETRY_COLUMNS</code>.
     */
    public static final GeometryColumns GEOMETRY_COLUMNS = burst.pool.migrator.nogroddb.information_schema.tables.GeometryColumns.GEOMETRY_COLUMNS;

    /**
     * The table <code>information_schema.GLOBAL_STATUS</code>.
     */
    public static final GlobalStatus GLOBAL_STATUS = burst.pool.migrator.nogroddb.information_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>information_schema.GLOBAL_VARIABLES</code>.
     */
    public static final GlobalVariables GLOBAL_VARIABLES = burst.pool.migrator.nogroddb.information_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>information_schema.INDEX_STATISTICS</code>.
     */
    public static final IndexStatistics INDEX_STATISTICS = burst.pool.migrator.nogroddb.information_schema.tables.IndexStatistics.INDEX_STATISTICS;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public static final InnodbBufferPage INNODB_BUFFER_PAGE = burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public static final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public static final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public static final InnodbCmp INNODB_CMP = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public static final InnodbCmpmem INNODB_CMPMEM = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public static final InnodbCmpmemReset INNODB_CMPMEM_RESET = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public static final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public static final InnodbCmpReset INNODB_CMP_RESET = burst.pool.migrator.nogroddb.information_schema.tables.InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public static final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public static final InnodbFtConfig INNODB_FT_CONFIG = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public static final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public static final InnodbFtDeleted INNODB_FT_DELETED = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public static final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = burst.pool.migrator.nogroddb.information_schema.tables.InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_LOCKS</code>.
     */
    public static final InnodbLocks INNODB_LOCKS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbLocks.INNODB_LOCKS;

    /**
     * The table <code>information_schema.INNODB_LOCK_WAITS</code>.
     */
    public static final InnodbLockWaits INNODB_LOCK_WAITS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public static final InnodbMetrics INNODB_METRICS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbMetrics.INNODB_METRICS;

    /**
     * The table <code>information_schema.INNODB_MUTEXES</code>.
     */
    public static final InnodbMutexes INNODB_MUTEXES = burst.pool.migrator.nogroddb.information_schema.tables.InnodbMutexes.INNODB_MUTEXES;

    /**
     * The table <code>information_schema.INNODB_SYS_COLUMNS</code>.
     */
    public static final InnodbSysColumns INNODB_SYS_COLUMNS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysColumns.INNODB_SYS_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_SYS_DATAFILES</code>.
     */
    public static final InnodbSysDatafiles INNODB_SYS_DATAFILES = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_SYS_FIELDS</code>.
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysFields.INNODB_SYS_FIELDS;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN</code>.
     */
    public static final InnodbSysForeign INNODB_SYS_FOREIGN = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysForeign.INNODB_SYS_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>.
     */
    public static final InnodbSysForeignCols INNODB_SYS_FOREIGN_COLS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_SYS_INDEXES</code>.
     */
    public static final InnodbSysIndexes INNODB_SYS_INDEXES = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES;

    /**
     * The table <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS</code>.
     */
    public static final InnodbSysSemaphoreWaits INNODB_SYS_SEMAPHORE_WAITS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysSemaphoreWaits.INNODB_SYS_SEMAPHORE_WAITS;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLES</code>.
     */
    public static final InnodbSysTables INNODB_SYS_TABLES = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTables.INNODB_SYS_TABLES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESPACES</code>.
     */
    public static final InnodbSysTablespaces INNODB_SYS_TABLESPACES = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTablespaces.INNODB_SYS_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESTATS</code>.
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysTablestats.INNODB_SYS_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_SYS_VIRTUAL</code>.
     */
    public static final InnodbSysVirtual INNODB_SYS_VIRTUAL = burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysVirtual.INNODB_SYS_VIRTUAL;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES_ENCRYPTION</code>.
     */
    public static final InnodbTablespacesEncryption INNODB_TABLESPACES_ENCRYPTION = burst.pool.migrator.nogroddb.information_schema.tables.InnodbTablespacesEncryption.INNODB_TABLESPACES_ENCRYPTION;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES_SCRUBBING</code>.
     */
    public static final InnodbTablespacesScrubbing INNODB_TABLESPACES_SCRUBBING = burst.pool.migrator.nogroddb.information_schema.tables.InnodbTablespacesScrubbing.INNODB_TABLESPACES_SCRUBBING;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public static final InnodbTrx INNODB_TRX = burst.pool.migrator.nogroddb.information_schema.tables.InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.KEY_CACHES</code>.
     */
    public static final KeyCaches KEY_CACHES = burst.pool.migrator.nogroddb.information_schema.tables.KeyCaches.KEY_CACHES;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = burst.pool.migrator.nogroddb.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public static final Parameters PARAMETERS = burst.pool.migrator.nogroddb.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public static final Partitions PARTITIONS = burst.pool.migrator.nogroddb.information_schema.tables.Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public static final Plugins PLUGINS = burst.pool.migrator.nogroddb.information_schema.tables.Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public static final Processlist PROCESSLIST = burst.pool.migrator.nogroddb.information_schema.tables.Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public static final Profiling PROFILING = burst.pool.migrator.nogroddb.information_schema.tables.Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = burst.pool.migrator.nogroddb.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public static final Routines ROUTINES = burst.pool.migrator.nogroddb.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public static final Schemata SCHEMATA = burst.pool.migrator.nogroddb.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public static final SchemaPrivileges SCHEMA_PRIVILEGES = burst.pool.migrator.nogroddb.information_schema.tables.SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SESSION_STATUS</code>.
     */
    public static final SessionStatus SESSION_STATUS = burst.pool.migrator.nogroddb.information_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>information_schema.SESSION_VARIABLES</code>.
     */
    public static final SessionVariables SESSION_VARIABLES = burst.pool.migrator.nogroddb.information_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>information_schema.SPATIAL_REF_SYS</code>.
     */
    public static final SpatialRefSys SPATIAL_REF_SYS = burst.pool.migrator.nogroddb.information_schema.tables.SpatialRefSys.SPATIAL_REF_SYS;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public static final Statistics STATISTICS = burst.pool.migrator.nogroddb.information_schema.tables.Statistics.STATISTICS;

    /**
     * The table <code>information_schema.SYSTEM_VARIABLES</code>.
     */
    public static final SystemVariables SYSTEM_VARIABLES = burst.pool.migrator.nogroddb.information_schema.tables.SystemVariables.SYSTEM_VARIABLES;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public static final burst.pool.migrator.nogroddb.information_schema.tables.Tables TABLES = burst.pool.migrator.nogroddb.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public static final Tablespaces TABLESPACES = burst.pool.migrator.nogroddb.information_schema.tables.Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = burst.pool.migrator.nogroddb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = burst.pool.migrator.nogroddb.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TABLE_STATISTICS</code>.
     */
    public static final TableStatistics TABLE_STATISTICS = burst.pool.migrator.nogroddb.information_schema.tables.TableStatistics.TABLE_STATISTICS;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public static final Triggers TRIGGERS = burst.pool.migrator.nogroddb.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public static final UserPrivileges USER_PRIVILEGES = burst.pool.migrator.nogroddb.information_schema.tables.UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.USER_STATISTICS</code>.
     */
    public static final UserStatistics USER_STATISTICS = burst.pool.migrator.nogroddb.information_schema.tables.UserStatistics.USER_STATISTICS;

    /**
     * The table <code>information_schema.user_variables</code>.
     */
    public static final UserVariables USER_VARIABLES = burst.pool.migrator.nogroddb.information_schema.tables.UserVariables.USER_VARIABLES;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public static final Views VIEWS = burst.pool.migrator.nogroddb.information_schema.tables.Views.VIEWS;
}