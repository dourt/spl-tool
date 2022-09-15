package com.qingxuan.database.compare.query;

/**
 * @author qingxuan 2022/9/14
 * @since 1.0
 */
public class ColumnInfo {

    /**
     * 数据库名称
     */
    private String databaseName;

    /**
     * 模式名称
     */
    private String schemataName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 列名
     */
    private String columnName;

    /**
     * 列所在位置
     */
    private Integer position;

    /**
     * 列是否可为空
     */
    private String nullable;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 最大长度
     */
    private Integer maxLength;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getSchemataName() {
        return schemataName;
    }

    public void setSchemataName(String schemataName) {
        this.schemataName = schemataName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
}
