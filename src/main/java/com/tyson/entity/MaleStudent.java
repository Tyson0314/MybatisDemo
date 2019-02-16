/**
 * Copyright (C), 2018-2019
 * FileName: MaleStudent
 * Author:   Tyson
 * Date:     2019/2/3/0003 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

import java.util.List;

/**
 * @author Tyson
 * @create 2019/2/3/0003 15:28
 * @since 1.0.0
 */
public class MaleStudent extends Student {
    List<MaleStudentHealth> maleStudentHealthList;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        maleStudentHealthList.forEach(maleStudentHealth -> {
            sb.append(maleStudentHealth.toString() + ", ");
        });
        return "MaleStudent{" +
               // "maleStudentHealthList=" + sb.toString() +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                //", sc=" + sc +
                //", studentLectureList=" + studentLectureList +
                '}';
    }

    public List<MaleStudentHealth> getMaleStudentHealthList() {
        return maleStudentHealthList;
    }

    public void setMaleStudentHealthList(List<MaleStudentHealth> maleStudentHealthList) {
        this.maleStudentHealthList = maleStudentHealthList;
    }
}