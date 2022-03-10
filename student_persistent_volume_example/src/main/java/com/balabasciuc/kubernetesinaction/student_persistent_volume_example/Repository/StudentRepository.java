package com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Repository;

import com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Doman.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
