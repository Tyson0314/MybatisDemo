/**
 * Copyright (C), 2018-2019
 * FileName: Lecture
 * Author:   Tyson
 * Date:     2019/2/3/0003 9:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/3/0003 9:45
 * @since 1.0.0
 */
public class Lecture {
    int id;
    String lectureName;

    @Override
    public String toString() {
        return "id: " + id + ", lectureName: " + lectureName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
}