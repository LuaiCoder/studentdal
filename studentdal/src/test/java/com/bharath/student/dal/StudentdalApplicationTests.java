package com.bharath.student.dal;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
public class StudentdalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent(){

        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Course");
        student.setFee(30d);



        studentRepository.save(student);

    }

    @Test
    public void testFindStudentById(){

        Optional<Student> optionstudent = studentRepository.findById(1L);
        Student student = optionstudent.get();


        System.out.print(student);
    }
    
    @Test
    public void testUpdateStudent(){

    	Optional<Student> optionstudent = studentRepository.findById(1L);
        Student student = optionstudent.get();

        student.setFee(40d);
        studentRepository.save(student);
    }

    @Test
    public void testDeleteStudent(){

 
        Student student = new Student();

        student.setId(1L);
        studentRepository.delete(student);
    }

    
    
    
    
    
}
