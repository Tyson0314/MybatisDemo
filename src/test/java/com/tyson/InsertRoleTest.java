/**
 * Copyright (C), 2018-2019
 * FileName: InsertRoleTest
 * Author:   Tyson
 * Date:     2019/1/30/0030 9:27
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
 * @create 2019/1/30/0030 9:27
 * @since 1.0.0
 */
@Slf4j
public class InsertRoleTest {
    @Test
    public void insertRoleTest1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setNote("hi");
            role.setRoleName("teacher");

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
    public void insertRoleUseGeneratedKeysTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setNote("hello");
            role.setRoleName("worker");

            roleMapper.insertRoleUseGeneratedKeys(role);
            log.info(role.toString());
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
    public void myInsertRoleTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setNote("hello");
            role.setRoleName("worker");

            roleMapper.myInsertRole(role);
            log.info(role.toString());
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

    /*    @Test
    public void insertRoleTest1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setId(4L);
            role.setNote("hi");
            role.setRoleName("teacher");
            role.setRegTime(new Date());

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
    }*/

    /*@Test
    public void insertRoleTest1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setId(6L);
            role.setNote("hello");
            role.setRoleName("worker");
            role.setRegTime(new Date());
            List<User> users = new ArrayList<>();
            User user = new User();
            User user1 = new User();
            user.setId(1L);
            user1.setId(2L);
            users.add(user);
            users.add(user1);
            role.setUsers(users);

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
    }*/
}