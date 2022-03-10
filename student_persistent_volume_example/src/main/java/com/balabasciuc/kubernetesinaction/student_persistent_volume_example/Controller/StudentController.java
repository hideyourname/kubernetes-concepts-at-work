package com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Controller;

import com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Doman.Student;
import com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> create(@RequestBody Student student)
    {
        studentService.create(student);
        return new ResponseEntity<>("Student was created!", HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable ("id") Long id)
    {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.FOUND);
    }
}
