package com.example.studentProperties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentProperties.entity.ItemsVO;
@Repository
public interface ItemsRepo extends JpaRepository<ItemsVO, Integer>{

}
