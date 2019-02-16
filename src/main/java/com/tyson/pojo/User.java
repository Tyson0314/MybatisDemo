/**
 * Copyright (C), 2018-2019
 * FileName: User
 * Author:   Tyson
 * Date:     2019/1/29/0029 18:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.pojo;

/**
 * @author Tyson
 * @create 2019/1/29/0029 18:20
 * @since 1.0.0
 */
public class User {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}