/**
 * Copyright (C), 2018-2019
 * FileName: StudentCard
 * Author:   Tyson
 * Date:     2019/2/2/0002 11:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/2/0002 11:19
 * @since 1.0.0
 */
public class StudentCard {
    int id;
    int sid;
    String note;

    @Override
    public String toString() {
        return "studentCard: " + id;
    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}