/**
 * Copyright (C), 2018-2019
 * FileName: FindRoleTest
 * Author:   Tyson
 * Date:     2019/1/20/0020 17:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson;

import com.tyson.mapper.RoleMapper;
import com.tyson.pojo.Role;
import com.tyson.pojo.RoleParam;
import com.tyson.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tyson
 * @create 2019/1/20/0020 17:31
 * @since 1.0.0
 */
@Slf4j
public class FindRoleTest {
    @Test
    public void findRoleByParams2Test() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParam param = new RoleParam();
            param.setRoleName("so");
            param.setNote("hi");
            List<Role> roles = roleMapper.findRoleByParams2(param);
            roles.forEach(role -> {
                log.info(role.toString());
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void findRoleByParams1Test() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roles = roleMapper.findRoleByParams1("so", "h");
            roles.forEach(role -> {
                log.info(role.toString());
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void insertRoleTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setId(2L);
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
    public void batchInsertRoleTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setNote("hi");
            role.setRoleName("teacher");
            role.setRegTime(new Date());

            Role role1 = new Role();
            role1.setNote("hello");
            role1.setRoleName("doctor");
            role1.setRegTime(new Date());

            List<Role> roleList = new ArrayList<>();
            roleList.add(role);
            roleList.add(role1);

            roleMapper.batchInsertRole(roleList);
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
    public void getRoleByRoleNameTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roles = roleMapper.getRoleByRoleName("man", new RowBounds(0, 5));
            roles.forEach(role -> {
                log.info(role.toString());
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void getRoleByIdTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRoleById(6L);
            log.info(role.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @Test
    public void findRolesTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("teacher");
            role.setNote("hi");
            List<Role> roles = roleMapper.findRoles(role);
            if(roles != null) {
                log.info(roles.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @Test
    public void findRolesByIdsTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            int[] ids = {41, 42, 43, 44};
            List<Role> roles = roleMapper.findRolesInIds(ids);
            log.info(roles.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}