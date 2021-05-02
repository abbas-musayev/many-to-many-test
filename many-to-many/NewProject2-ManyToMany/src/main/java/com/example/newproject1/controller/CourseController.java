package com.example.newproject1.controller;

import com.example.newproject1.dto.CourseDTO;
import com.example.newproject1.service.CourseService;
import com.example.newproject1.db.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/courses")
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseDTO> saveCourse(@RequestBody CourseDTO courseDTO) {
        return new ResponseEntity<>(courseService.saveCourse(courseDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> getCourses() {
        return new ResponseEntity<>(courseService.getCourses(), HttpStatus.OK);
    }

}
