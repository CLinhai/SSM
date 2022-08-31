package com.dao;

import com.pojo.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectAllStudents();
}
