package com.tyson.mapper;

import com.tyson.entity.Student;
import com.tyson.pojo.ProcedureParam;

public interface StudentMapper {
    public Student findStudent(int id);
//    public Student findStudent(int id);
    public void insertStudent(Student student);
    public void gesCount(ProcedureParam procedureParam);
}
