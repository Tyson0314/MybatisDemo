/**
 * Copyright (C), 2018-2019
 * FileName: FemaleStudent
 * Author:   Tyson
 * Date:     2019/2/3/0003 15:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

import java.util.List;

/**
 * @author Tyson
 * @create 2019/2/3/0003 15:38
 * @since 1.0.0
 */
public class FemaleStudent extends Student {
    List<FemaleStudentHealth> femaleStudentHealthList;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        femaleStudentHealthList.forEach(femaleStudentHealth -> {
            sb.append(femaleStudentHealth.toString() + ", ");
        });
        return "FemaleStudent{" +
                //"femaleStudentHealthList=" + sb.toString() +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                //", sc=" + sc +
                //", studentLectureList=" + studentLectureList +
                '}';
    }

    public List<FemaleStudentHealth> getFemaleStudentHealthList() {
        return femaleStudentHealthList;
    }

    public void setFemaleStudentHealthList(List<FemaleStudentHealth> femaleStudentHealthList) {
        this.femaleStudentHealthList = femaleStudentHealthList;
    }
}