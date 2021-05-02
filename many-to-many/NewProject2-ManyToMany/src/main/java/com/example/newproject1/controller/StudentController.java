package com.example.newproject1.controller;

import com.example.newproject1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.newproject1.dto.StudentDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> saveStudent(@RequestBody  StudentDTO studentDTO) {
        return new ResponseEntity<>(studentService.saveStudent(studentDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getStudents() {
        return null;
    }
}
