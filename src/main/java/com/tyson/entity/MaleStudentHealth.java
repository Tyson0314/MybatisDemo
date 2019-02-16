/**
 * Copyright (C), 2018-2019
 * FileName: MaleStudentHealth
 * Author:   Tyson
 * Date:     2019/2/3/0003 15:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.entity;

/**
 * @author Tyson
 * @create 2019/2/3/0003 15:30
 * @since 1.0.0
 */
public class MaleStudentHealth {
    int height;

    @Override
    public String toString() {
        return "MaleStudentHealth{" +
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