/**
 * Copyright (C), 2018-2019
 * FileName: Role
 * Author:   Tyson
 * Date:     2019/1/19/0019 23:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author Tyson
 * @create 2019/1/19/0019 23:10
 * @since 1.0.0
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;
    private Date regTime;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", roleName: " + roleName + ", note: " + note + ", regTime: "
                + regTime; //+ ", users: " + users.get(0);
    }

}