/**
 * Copyright (C), 2018-2019
 * FileName: Student
 * Author:   Tyson
 * Date:     2019/2/2/0002 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

import java.util.List;

/**
 * @author Tyson
 * @create 2019/2/2/0002 11:17
 * @since 1.0.0
 */
public class Student {
    int id;
    String name;
    Sex sex;
    StudentCard sc;
    List<StudentLecture> studentLectureList;

    public List<StudentLecture> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLecture> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    public StudentCard getSc() {
        return sc;
    }

    public void setSc(StudentCard sc) {
        this.sc = sc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
/*        StringBuffer sb = new StringBuffer();
        studentLectureList.forEach(studentLecture -> {
            sb.append(studentLecture.toString() + ", ");
        });*/
        return "id: " + id +
                ", name: " + name +
                ", sex: " + sex;
                //", studentLectureList: " + sb.toString() +
                //", cardId: " + sc.getId();
    }
}