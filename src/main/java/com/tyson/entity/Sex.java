/**
 * Copyright (C), 2018-2019
 * FileName: Sex
 * Author:   Tyson
 * Date:     2019/2/2/0002 11:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/2/0002 11:48
 * @since 1.0.0
 */
public enum  Sex {
    MALE(1, "男"),  FEMALE(2, "女");

    private int id;
    private String name;

    private Sex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Sex getSex(int id) {
        if(id == 1) {
            return MALE;
        } else if(id == 2) {
            return FEMALE;
        } else {
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}