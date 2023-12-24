package io.quarkiverse.jooq.pro.runtime;

import org.jboss.logging.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import io.agroal.api.AgroalDataSource;
import io.quarkiverse.jooq.runtime.JooqCustomContext;

public class DslContextFactory {
    private static final Logger log = Logger.getLogger(DslContextFactory.class);

    static {
        System.setProperty("org.jooq.no-logo", String.valueOf(true));
    }

    static public DSLContext create(String sqlDialect, AgroalDataSource ds, JooqCustomContext customContext) {
        DSLContext context;
        if ("PostgreSQL".equalsIgnoreCase(sqlDialect) || "Postgres".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES);
        } else if ("PostgreSQL15".equalsIgnoreCase(sqlDialect) || "Postgres15".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_15);
        } else if ("PostgreSQL14".equalsIgnoreCase(sqlDialect) || "Postgres14".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_14);
        } else if ("PostgreSQL13".equalsIgnoreCase(sqlDialect) || "Postgres13".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_13);
        } else if ("PostgreSQL12".equalsIgnoreCase(sqlDialect) || "Postgres12".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_12);
        } else if ("PostgreSQL11".equalsIgnoreCase(sqlDialect) || "Postgres11".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_11);
        } else if ("PostgreSQL10".equalsIgnoreCase(sqlDialect) || "Postgres10".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_10);
        } else if ("PostgreSQL93".equalsIgnoreCase(sqlDialect) || "Postgres93".equalsIgnoreCase(sqlDialect)
                || "PostgreSQL9.3".equalsIgnoreCase(sqlDialect) || "Postgres9.3".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_9_3);
        } else if ("PostgreSQL94".equalsIgnoreCase(sqlDialect) || "Postgres94".equalsIgnoreCase(sqlDialect)
                || "PostgreSQL9.4".equalsIgnoreCase(sqlDialect) || "Postgres9.4".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_9_4);
        } else if ("PostgreSQL95".equalsIgnoreCase(sqlDialect) || "Postgres95".equalsIgnoreCase(sqlDialect)
                || "PostgreSQL9.5".equalsIgnoreCase(sqlDialect) || "Postgres9.5".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.POSTGRES_9_5);
        } else if ("MySQL".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL);
        } else if ("MySQL57".equalsIgnoreCase(sqlDialect) || "MySQL5.7".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL_5_7);
        } else if ("MySQL80".equalsIgnoreCase(sqlDialect) || "MySQL8.0".equalsIgnoreCase(sqlDialect)
                || "MySQL8".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL_8_0);
        } else if ("MySQL8019".equalsIgnoreCase(sqlDialect) || "MySQL8.0.19".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL_8_0_19);
        } else if ("MySQL8020".equalsIgnoreCase(sqlDialect) || "MySQL8.0.20".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL_8_0_20);
        } else if ("MySQL8031".equalsIgnoreCase(sqlDialect) || "MySQL8.0.31".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MYSQL_8_0_31);
        } else if ("MARIADB".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB);
        } else if ("MARIADB10".equalsIgnoreCase(sqlDialect) || "MARIADB10.0".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB);
        } else if ("MARIADB10.1".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_1);
        } else if ("MARIADB10.2".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_2);
        } else if ("MARIADB10.3".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_3);
        } else if ("MARIADB10.4".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_4);
        } else if ("MARIADB10.5".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_5);
        } else if ("MARIADB10.6".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_6);
        } else if ("MARIADB10.7".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MARIADB_10_7);
        } else if ("Oracle".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DEFAULT);
        } else if ("ORACLE10G".equalsIgnoreCase(sqlDialect)) {
            // Note: Deprecated for removal
            context = DSL.using(ds, SQLDialect.ORACLE10G);
        } else if ("ORACLE11G".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE11G);
        } else if ("ORACLE12C".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE12C);
        } else if ("ORACLE18C".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE18C);
        } else if ("ORACLE20C".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE20C);
        } else if ("ORACLE21C".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE21C);
        } else if ("ORACLE23C".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ORACLE23C);
        } else if ("SQLServer".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DEFAULT);
        } else if ("SQLSERVER2008".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2008);
        } else if ("SQLSERVER2012".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2012);
        } else if ("SQLSERVER2014".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2014);
        } else if ("SQLSERVER2016".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2016);
        } else if ("SQLSERVER2017".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2017);
        } else if ("SQLSERVER2022".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLSERVER2022);
        } else if ("Derby".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DERBY);
        } else if ("HSQLDB".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.HSQLDB);
        } else if ("H2".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.H2);
        } else if ("Firebird".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.FIREBIRD);
        } else if ("Firebird25".equalsIgnoreCase(sqlDialect) || "Firebird2.5".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.FIREBIRD_2_5);
        } else if ("Firebird30".equalsIgnoreCase(sqlDialect) || "Firebird3.0".equalsIgnoreCase(sqlDialect)
                || "Firebird3".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.FIREBIRD_3_0);
        } else if ("Firebird40".equalsIgnoreCase(sqlDialect) || "Firebird4.0".equalsIgnoreCase(sqlDialect)
                || "Firebird4".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.FIREBIRD_4_0);
        } else if ("SQLite".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE);
        } else if ("SQLite325".equalsIgnoreCase(sqlDialect) || "SQLite3.25".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_25);
        } else if ("SQLite328".equalsIgnoreCase(sqlDialect) || "SQLite3.28".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_28);
        } else if ("SQLite330".equalsIgnoreCase(sqlDialect) || "SQLite3.30".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_30);
        } else if ("SQLite338".equalsIgnoreCase(sqlDialect) || "SQLite3.38".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_38);
        } else if ("SQLite339".equalsIgnoreCase(sqlDialect) || "SQLite3.39".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_39);
        } else if ("SQLite340".equalsIgnoreCase(sqlDialect) || "SQLite3.40".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLITE_3_40);
        } else if ("ACCESS".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ACCESS);
        } else if ("ACCESS2013".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ACCESS2013);
        } else if ("ASE".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ASE);
        } else if ("ASE125".equalsIgnoreCase(sqlDialect) || "ASE12.5".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ASE_12_5);
        } else if ("ASE155".equalsIgnoreCase(sqlDialect) || "ASE15.5".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ASE_15_5);
        } else if ("ASE157".equalsIgnoreCase(sqlDialect) || "ASE15.7".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ASE_15_7);
        } else if ("ASE160".equalsIgnoreCase(sqlDialect) || "ASE16.0".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.ASE_16_0);
        } else if ("AURORAMYSQL".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.AURORA_MYSQL);
        } else if ("AURORAPOSTGRES".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.AURORA_POSTGRES);
        } else if ("COCKROACHDB".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.COCKROACHDB);
        } else if ("COCKROACHDB20".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.COCKROACHDB_20);
        } else if ("COCKROACHDB21".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.COCKROACHDB_21);
        } else if ("COCKROACHDB22".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.COCKROACHDB_22);
        } else if ("COCKROACHDB23".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.COCKROACHDB_23);
        } else if ("DB2".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DB2);
        } else if ("DB29".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DB2_9);
        } else if ("DB210".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DB2_10);
        } else if ("DB211".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DB2_11);
        } else if ("HANA".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.HANA);
        } else if ("INFORMIX".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.INFORMIX);
        } else if ("INGRES".equalsIgnoreCase(sqlDialect)) {
            // Note: Deprecated for removal
            context = DSL.using(ds, SQLDialect.INGRES);
        } else if ("MEMSQL".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.MEMSQL);
        } else if ("REDSHIFT".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.REDSHIFT);
        } else if ("SQLDATAWAREHOUSE".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SQLDATAWAREHOUSE);
        } else if ("SYBASE".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.SYBASE);
        } else if ("TERADATA".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.TERADATA);
        } else if ("VERTICA".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.VERTICA);
        } else if ("DuckDB".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.DUCKDB);
        } else if ("Trino".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.TRINO);
        } else if ("YugabyteDB".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.YUGABYTEDB);
        } else if ("YugabyteDB29".equalsIgnoreCase(sqlDialect) || "YugabyteDB2.9".equalsIgnoreCase(sqlDialect)) {
            context = DSL.using(ds, SQLDialect.YUGABYTEDB_2_9);
        } else {
            log.warnv("Undefined sqlDialect: {0}", sqlDialect);
            context = DSL.using(ds, SQLDialect.DEFAULT);
        }
        customContext.apply(context.configuration());
        return context;
    }

}
