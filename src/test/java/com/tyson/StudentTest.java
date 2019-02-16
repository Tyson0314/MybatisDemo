/**
 * Copyright (C), 2018-2019
 * FileName: StudentTest
 * Author:   Tyson
 * Date:     2019/2/2/0002 16:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson;

import com.tyson.entity.Sex;
import com.tyson.entity.Student;
import com.tyson.entity.StudentCard;
import com.tyson.mapper.StudentCardMapper;
import com.tyson.mapper.StudentMapper;
import com.tyson.pojo.ProcedureParam;
import com.tyson.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Tyson
 * @create 2019/2/2/0002 16:57
 * @since 1.0.0
 */
@Slf4j
public class StudentTest {
    @Test
    public void getCountTest() {
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            ProcedureParam procedureParam = new ProcedureParam();
            procedureParam.setSex(2);
            studentMapper.gesCount(procedureParam);
            String sex = procedureParam.getSex() == 1 ? "male" : "female";
            log.info("sex: " + sex + " count: " + procedureParam.getGesCount());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @Test
    public void findStudentCardByStudentIdTest() {
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentCardMapper studentCardMapper = sqlSession.getMapper(StudentCardMapper.class);
            StudentCard sc = studentCardMapper.findStudentCardByStudentId(1);
            log.info(sc.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void findStudentTest() {
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student s = studentMapper.findStudent(1);
            //log.info("***********获取学生证信息***********");
            //log.info("学生的学生证信息：" + s.getSc().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

/*    @Test
    public void findStudentTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student s = studentMapper.findStudent(1);
            if(s != null) {
                log.info(s.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    */
    @Test
    public void insertStudentTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student s = new Student();
            s.setName("tyson");
            s.setSex(Sex.FEMALE);
            studentMapper.insertStudent(s);
            log.info(s.toString());
            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}