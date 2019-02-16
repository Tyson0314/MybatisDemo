/**
 * Copyright (C), 2018-2019
 * FileName: SexEnumTypeHandler
 * Author:   Tyson
 * Date:     2019/2/2/0002 18:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.typeHandler;

import com.tyson.entity.Sex;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Tyson
 * @create 2019/2/2/0002 18:09
 * @since 1.0.0
 */
@Slf4j
public class SexEnumTypeHandler implements TypeHandler<Sex> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Sex sex, JdbcType jdbcType) throws SQLException {
        //log.info("预编译语句设置参数: " + i);
        preparedStatement.setInt(i, sex.getId());
    }

    @Override
    public Sex getResult(ResultSet resultSet, String s) throws SQLException {
        //log.info("由列名 "  + s + " 获取字符串：" + resultSet.getString(s));
        int id = resultSet.getInt(s);
        return Sex.getSex(id);
    }

    @Override
    public Sex getResult(ResultSet resultSet, int i) throws SQLException {
        //log.info("由下标 "  + i + " 获取字符串：" + resultSet.getInt(i));
        int id = resultSet.getInt(i);
        return Sex.getSex(id);
    }

    @Override
    public Sex getResult(CallableStatement callableStatement, int i) throws SQLException {
        //log.info("callbleStatement下标 "  + i + " 获取字符串：" + callableStatement.getInt(i));
        int id = callableStatement.getInt(i);
        return Sex.getSex(id);
    }
}