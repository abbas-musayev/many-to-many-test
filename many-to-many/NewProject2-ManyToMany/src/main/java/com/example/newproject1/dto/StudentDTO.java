package com.example.newproject1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentDTO {
    private long id;
    private String nameStudent;
    private String surnameStudent;
    private String serialNo;
    private List<Long> courses;
}
