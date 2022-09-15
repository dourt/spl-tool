package com.qingxuan.database.compare.query;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 查询模式、表/集合、字段
 *
 * @author dourentian 2022/9/13
 * @since 1.0
 */
public interface Query extends AutoCloseable {

    /**
     * 获取数据库集合
     *
     * @return 数据库集合
     * @throws Exception 具体异常取决于子类
     */
    List<String> getDatabase() throws Exception;

    /**
     * 获取模式集合
     *
     * @param name 数据库名
     * @return 模式
     * @throws Exception 具体异常取决于子类
     */
    default List<String> getSchemata(String name) throws Exception {
        return Lists.newArrayList();
    }

    /**
     * 获取表/集合
     *
     * @param name 数据库名或者模式名
     * @return 表/集合
     * @throws Exception 具体异常取决于子类
     */
    List<String> getTable(String name) throws Exception;

    /**
     * 获取列
     *
     * @param name 数据库名或者模式名
     * @return 列
     * @throws Exception 具体异常取决于子类
     */
    List<ColumnInfo> getColumn(String name) throws Exception;

}
