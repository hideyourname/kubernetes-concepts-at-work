package com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Service;

import com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Doman.Student;
import com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public void create(Student student) {
        studentRepository.save(student);
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
