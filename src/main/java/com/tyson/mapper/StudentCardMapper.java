/**
 * Copyright (C), 2018-2019
 * FileName: StudentCardMapper
 * Author:   Tyson
 * Date:     2019/2/2/0002 18:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.mapper;

import com.tyson.entity.StudentCard;

/**
 * @author Tyson
 * @create 2019/2/2/0002 18:51
 * @since 1.0.0
 */
public interface StudentCardMapper {
    public StudentCard findStudentCardByStudentId(int sid);
}