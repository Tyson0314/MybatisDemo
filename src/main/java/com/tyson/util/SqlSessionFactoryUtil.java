/**
 * Copyright (C), 2018-2019
 * FileName: SqlSessionFactoryUtil
 * Author:   Tyson
 * Date:     2019/1/20/0020 22:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Tyson
 * @create 2019/1/20/0020 22:05
 * @since 1.0.0
 */
public class SqlSessionFactoryUtil   {
    private static SqlSessionFactory sqlSessionFactory = null;
    //类线程锁
    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;

    /**
     * 私有化构造器
     */
    private SqlSessionFactoryUtil() {}

    public static SqlSessionFactory initSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        synchronized (CLASS_LOCK) {
            if(sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if(sqlSessionFactory == null) {
            initSqlSessionFactory();
        }

        return sqlSessionFactory.openSession();
    }
}