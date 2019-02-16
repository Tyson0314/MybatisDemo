/**
 * Copyright (C), 2018-2019
 * FileName: FemaleStudentHealth
 * Author:   Tyson
 * Date:     2019/2/3/0003 15:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/3/0003 15:37
 * @since 1.0.0
 */
public class FemaleStudentHealth {
    int height;

    @Override
    public String toString() {
        return "FemaleStudentHealth{" +
                "height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}