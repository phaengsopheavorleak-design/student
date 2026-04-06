package org.example.mytest_batis.controller;

import org.example.mytest_batis.model.Student;
import org.example.mytest_batis.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/getAllStudent")
    List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

}
