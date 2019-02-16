/**
 * Copyright (C), 2018-2019
 * FileName: RoleTest
 * Author:   Tyson
 * Date:     2019/1/30/0030 10:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson;

import com.tyson.mapper.RoleMapper;
import com.tyson.pojo.Role;
import com.tyson.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Tyson
 * @create 2019/1/30/0030 10:36
 * @since 1.0.0
 */
@Slf4j
public class RoleTest {

    @Test
    public void roleTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setNote("emm");
            role.setRoleName("man");

            roleMapper.insertRole(role);
            roleMapper.insertRole(role);
            roleMapper.insertRole(role);

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void updateRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setId(2L);
            role.setRoleName("actor");
            role.setNote("fired");
            //role.setRegTime(new Date());
            roleMapper.updateRole(role);
            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void deleteRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            roleMapper.deleteRole(8L);
            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}