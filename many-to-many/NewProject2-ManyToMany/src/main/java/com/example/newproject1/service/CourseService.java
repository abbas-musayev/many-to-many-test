package com.example.newproject1.service;

import com.example.newproject1.dto.CourseDTO;
import java.util.List;

public interface CourseService {
    CourseDTO saveCourse(CourseDTO courseDTO);
    List<CourseDTO> getCourses();
}
