package com.LearningRESTAPIs.service;

import com.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.LearningRESTAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

   // StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
