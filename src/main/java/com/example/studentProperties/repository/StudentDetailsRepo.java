package com.example.studentProperties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentProperties.entity.StudentDetailsVO;
@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetailsVO, Integer>{

}
