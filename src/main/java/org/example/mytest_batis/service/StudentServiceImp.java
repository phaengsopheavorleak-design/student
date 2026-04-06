package org.example.mytest_batis.service;

import org.example.mytest_batis.model.Student;
import org.example.mytest_batis.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImp implements StudentService{
    private final StudentRepo studentRepo;

    public StudentServiceImp(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepo.getAllStudent();

    }


}
