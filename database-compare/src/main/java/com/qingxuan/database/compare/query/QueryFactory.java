package com.qingxuan.database.compare.query;

import java.sql.SQLException;

/**
 * @author dourentian 2022/9/13
 * @since 1.0
 */
public interface QueryFactory {

    /**
     * 获取工厂实例
     *
     * @param properties 属性
     * @return 工厂实例
     * @throws Exception 抛出异常
     */
    Query getInstance(ConnectionProperties properties) throws Exception;
}
