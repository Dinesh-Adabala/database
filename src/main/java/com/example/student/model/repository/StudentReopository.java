package com.example.student.model.repository;

import com.example.student.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReopository extends JpaRepository<StudentEntity,Integer> {
}
