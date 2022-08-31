package com.service.impl;

import com.dao.StudentDao;
import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao stuDao;

    @Override
    public int addStudent(Student student) {
        return stuDao.insertStudent(student);
    }

    @Override
    public List<Student> findStudents() {
        return stuDao.selectAllStudents();
    }
}
