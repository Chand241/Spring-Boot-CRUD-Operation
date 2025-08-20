package com.learn.spring.boot.repository;

import com.learn.spring.boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
