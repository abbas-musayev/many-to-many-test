package com.example.newproject1.service;

import com.example.newproject1.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDTO);

    List<StudentDTO> getStudent();
}
