package com.qingxuan.database.compare.query.postgres;

/**
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public enum PostgresqlStatementEnum {

    /**
     * 获取数据库语句
     */
    DATABASE("select datname from pg_database"),

    /**
     * 获取当前数据库下模式语句
     */
    SCHEMATA("select schema_name from information_schema.schemata"),

    /**
     * 根据库名获取表
     */
    TABLE("select tablename from pg_tables where schemaname = ?"),

    /**
     * 根据库名获取列
     */
    COLUMN("select table_catalog as databaseName,table_schema as schemataName,table_name as tableName,column_name as columnName, " +
            "ordinal_position as position,is_nullable as nullable,data_type as dataType,character_maximum_length as maxLength " +
            "from information_schema.columns where table_schema = ?");

    private final String statement;

    PostgresqlStatementEnum(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }
}

