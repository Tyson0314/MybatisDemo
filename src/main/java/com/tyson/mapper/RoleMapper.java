/**
 * Copyright (C), 2018-2019
 * FileName: RoleMapper
 * Author:   Tyson
 * Date:     2019/1/19/0019 23:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.mapper;

import com.tyson.pojo.Role;
import com.tyson.pojo.RoleParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author Tyson
 * @create 2019/1/19/0019 23:12
 * @since 1.0.0
 */
public interface RoleMapper {
    public List<Role> getRoleByRoleName(@Param("roleName") String roleName, RowBounds rowBounds);
    public List<Role> findRoles(Role role);
    public Role getRoleById(@Param("id") long id);
    public List<Role> findRolesInIds(@Param("ids") int[] ids);
    public void insertRole(Role role);
    //List没有使用@Param指定参数名称，则对应Mapper.xml中的collection名称为list
    public void batchInsertRole(@Param("roleList") List<Role> roleList);
    public void myInsertRole(Role role);
    public void insertRoleUseGeneratedKeys(Role role);
    public List<Role> findRoleByParams1(@Param("roleName") String roleName, @Param("note")String note);
    public List<Role> findRoleByParams2(RoleParam roleParam);
    public void updateRole(Role role);
    public void deleteRole(long id);
}