package com.example.newproject1.service.impl;

import com.example.newproject1.db.entity.Course;
import com.example.newproject1.db.entity.Student;
import com.example.newproject1.db.repo.CourseEntityRepository;
import com.example.newproject1.db.repo.StudentEntityRepository;
import com.example.newproject1.dto.StudentDTO;
import com.example.newproject1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentEntityRepository studentEntityRepository;
    private final CourseEntityRepository courseEntityRepository;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        List<Course> courseList = new ArrayList<>();
        for (Long id : studentDTO.getCourses()) {
            courseList.add(courseEntityRepository.findById(id).get());
        }
        var entity = studentEntityRepository.save(Student.builder()
                .courses(courseList)
                .name(studentDTO.getNameStudent())
                .surname(studentDTO.getSurnameStudent())
                .passport(studentDTO.getSerialNo())
                .build());
        return StudentDTO.builder()
                .nameStudent(entity.getName())
                .serialNo(entity.getPassport())
                .surnameStudent(entity.getSurname())
                .id(entity.getId())
                .build();
    }

    @Override
    public List<StudentDTO> getStudent() {
        return null;
    }
}
