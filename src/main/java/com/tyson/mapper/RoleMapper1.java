/**
 * Copyright (C), 2018-2019
 * FileName: RoleMapper1
 * Author:   Tyson
 * Date:     2019/1/20/0020 20:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.mapper;

import com.tyson.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Tyson
 * @create 2019/1/20/0020 20:31
 * @since 1.0.0
 */
public interface RoleMapper1 {
    @Select(value="SELECT id, role_name as roleName, note from role where id = #{id}")
    public Role getRole(@Param("id") Long id);
}