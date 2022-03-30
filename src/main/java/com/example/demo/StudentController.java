package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rieugene Basilisco (generieu17@gmail.com)
 * @project demo
 * @created Mar 30, 2022 11:27 PM
 */

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepo studentRepo;

    @GetMapping("/")
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return new ResponseEntity<>("Student saved!", HttpStatus.CREATED);
    }

}
