/**
 * Copyright (C), 2018-2019
 * FileName: StudentLectureMapper
 * Author:   Tyson
 * Date:     2019/2/3/0003 9:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.mapper;

import com.tyson.entity.StudentLecture;

/**
 * @author Tyson
 * @create 2019/2/3/0003 9:52
 * @since 1.0.0
 */
public interface StudentLectureMapper {
    public StudentLecture findStudentLectureByStudentId(int sid);
}