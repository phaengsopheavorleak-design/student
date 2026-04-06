package org.example.mytest_batis.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.mytest_batis.model.Student;

import java.util.List;

@Mapper
public interface StudentRepo {
    @Select("SELECT * From students")
    List<Student> getAllStudent();
}
