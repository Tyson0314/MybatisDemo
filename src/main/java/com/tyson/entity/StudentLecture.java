/**
 * Copyright (C), 2018-2019
 * FileName: StudentLecture
 * Author:   Tyson
 * Date:     2019/2/3/0003 9:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/3/0003 9:46
 * @since 1.0.0
 */
public class StudentLecture {
    int id;
    int studentId;
    Lecture lecture;
    int grade;

    @Override
    public String toString() {
        return "StudentLecture{" +
                "studentId=" + studentId +
                //", lecture=" + lecture +
                ", grade=" + grade +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}