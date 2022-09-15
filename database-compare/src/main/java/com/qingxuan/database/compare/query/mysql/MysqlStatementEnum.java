package com.qingxuan.database.compare.query.mysql;

/**
 * @author qingxuan 2022/9/13
 * @since 1.0
 */
public enum MysqlStatementEnum {

    /**
     * 获取数据库语句
     */
    DATABASE("select SCHEMA_NAME from information_schema.SCHEMATA"),

    /**
     * 获取当前数据库下模式语句
     */
    SCHEMATA(""),

    /**
     * 根据库名获取表
     */
    TABLE("select TABLE_NAME from information_schema.TABLES where TABLE_SCHEMA = ?"),

    /**
     * 根据库名获取列
     */
    COLUMN("select TABLE_SCHEMA as databaseName,TABLE_NAME as tableName,COLUMN_NAME as columnName," +
            "ORDINAL_POSITION as position,IS_NULLABLE as nullable,DATA_TYPE as dataType," +
            "CHARACTER_MAXIMUM_LENGTH as maxLength from information_schema.COLUMNS where TABLE_SCHEMA = ?");

    private final String statement;

    MysqlStatementEnum(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }
}

