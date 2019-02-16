/**
 * Copyright (C), 2018-2019
 * FileName: Customer
 * Author:   Tyson
 * Date:     2019/1/30/0030 9:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.pojo;

/**
 * @author Tyson
 * @create 2019/1/30/0030 9:56
 * @since 1.0.0
 */
public class Customer {
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}