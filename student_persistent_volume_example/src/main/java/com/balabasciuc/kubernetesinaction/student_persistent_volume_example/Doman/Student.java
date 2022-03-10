package com.balabasciuc.kubernetesinaction.student_persistent_volume_example.Doman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;

    private String studentName;
    private String studentPrename;

    protected Student() {}

    public Student(String studentName, String studentPrename) {
        this.studentName = studentName;
        this.studentPrename = studentPrename;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPrename() {
        return studentPrename;
    }

    public void setStudentPrename(String studentPrename) {
        this.studentPrename = studentPrename;
    }
}
