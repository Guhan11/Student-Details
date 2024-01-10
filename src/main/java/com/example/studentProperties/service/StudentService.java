package com.example.studentProperties.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.studentProperties.entity.ItemsVO;
import com.example.studentProperties.entity.StudentDetailsVO;

@Service
public interface StudentService {
//StudentDetails
	public List<StudentDetailsVO> getAllStudent();
	public StudentDetailsVO getStudentById(int id);
	public StudentDetailsVO createStudent(StudentDetailsVO StudentVO);
	public ResponseEntity<?> updateStudent (int id,StudentDetailsVO StudentVO);
	public ResponseEntity<?>deleteStudent (int id);
	
//Items
	public List<ItemsVO> getAllItems();
	public ItemsVO getItemsById(int id);
	public ItemsVO createItems(ItemsVO itemsVO);
	public ResponseEntity<?> updateItems(int id,ItemsVO itemsVO);
	public ResponseEntity<?>deleteItems(int id);
}
