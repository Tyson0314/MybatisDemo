/**
 * Copyright (C), 2018-2019
 * FileName: MyListTypeHandler
 * Author:   Tyson
 * Date:     2019/1/29/0029 12:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.typeHandler;

import com.tyson.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyson
 * @create 2019/1/29/0029 12:44
 * @since 1.0.0
 */
@Slf4j
@MappedTypes({List.class})
@MappedJdbcTypes({JdbcType.VARCHAR})
public class MyListTypeHandler extends BaseTypeHandler<List<User>> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<User> users, JdbcType jdbcType) throws SQLException {
        log.info("预编译语句设置参数: " + users.get(0));
        StringBuffer sb = new StringBuffer();
        users.forEach(user -> {
            sb.append(user.getId() + ",");
        });
        preparedStatement.setString(i, sb.toString());
    }

    @Override
    public List<User> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        log.info("由列名 " + s + " 获取字符串：" + resultSet.getString(s));
        return stringToUsers(resultSet.getString(s));
    }

    @Override
    public List<User> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        log.info("由下标 " + i + " 获取字符串：" + resultSet.getString(i));
        return stringToUsers(resultSet.getString(i));
    }

    @Override
    public List<User> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

    public List<User> stringToUsers(String s) {
        String[] strs = s.split(",");
        List<User> users = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            users.add(stringToUser(strs[i]));
        }

        return users;
    }

    public User stringToUser(String s) {
        if(s == null || s.isEmpty()) {
            return null;
        }
        User user = new User();
        user.setId(Long.valueOf(s));
        return user;
    }
}