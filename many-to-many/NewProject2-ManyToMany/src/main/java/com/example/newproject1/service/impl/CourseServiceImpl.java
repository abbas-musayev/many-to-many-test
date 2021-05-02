package com.example.newproject1.service.impl;

import com.example.newproject1.db.entity.Course;
import com.example.newproject1.db.repo.CourseEntityRepository;
import com.example.newproject1.dto.CourseDTO;
import com.example.newproject1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    private final CourseEntityRepository courseEntityRepository;
    @Override
    public CourseDTO saveCourse(CourseDTO courseDTO) {
        var entity = Course.builder()
                .name(courseDTO.getName())
                .build();
        entity = courseEntityRepository.save(entity);
        return CourseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    @Override
    public List<CourseDTO> getCourses() {
        var entities = courseEntityRepository.findAll();
        List<CourseDTO> courseDTOS = new ArrayList<>();
        for (Course course: entities) {
            courseDTOS.add(CourseDTO.builder()
                    .name(course.getName())
                    .id(course.getId())
                    .build());
        }
        return courseDTOS;
    }
}
