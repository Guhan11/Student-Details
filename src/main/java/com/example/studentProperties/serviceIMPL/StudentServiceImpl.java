package com.example.studentProperties.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.studentProperties.entity.ItemsVO;
import com.example.studentProperties.entity.StudentDetailsVO;
import com.example.studentProperties.repository.ItemsRepo;
import com.example.studentProperties.repository.StudentDetailsRepo;
import com.example.studentProperties.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDetailsRepo studentRepo;
	@Autowired
	ItemsRepo itemsRepo;
//StudentDetailsVO
	@Override
	public List<StudentDetailsVO> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public StudentDetailsVO getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public StudentDetailsVO createStudent(StudentDetailsVO StudentVO) {
		// TODO Auto-generated method stub
		return studentRepo.save(StudentVO);
	}

	@Override
	public ResponseEntity<?> updateStudent(int id, StudentDetailsVO studentVO) {
		StudentDetailsVO studentDetailsVO = studentRepo.findById(id).get(); 
		studentDetailsVO.setName(studentDetailsVO.getName());
		studentDetailsVO.setAddress(studentDetailsVO.getAddress());
		studentDetailsVO.setAge(studentDetailsVO.getAge());
		studentRepo.save(studentDetailsVO);
		return ResponseEntity.ok().body("Update Successfully");
	}

	@Override
	public ResponseEntity<?> deleteStudent(int id) {
		
		studentRepo.deleteById(id);
		return ResponseEntity.ok().body("Deleted Successfully");
	}

// ItemsVO
	@Override
	public List<ItemsVO> getAllItems() {
		// TODO Auto-generated method stub
		return itemsRepo.findAll();
	}

	@Override
	public ItemsVO getItemsById(int id) {
		// TODO Auto-generated method stub
		return itemsRepo.findById(id).orElse(null);
	}

	@Override
	public ItemsVO createItems(ItemsVO itemsVO) {
		// TODO Auto-generated method stub
		return itemsRepo.save(itemsVO);
	}

	@Override
	public ResponseEntity<?> updateItems(int id, ItemsVO itemsVO) {
		ItemsVO items = itemsRepo.findById(id).get();
		items.setAccessories(items.getAccessories());
		items.setToys(items.getToys());
		itemsRepo.save(itemsVO);
		return ResponseEntity.ok().body("Updated Successfully");
	}

	@Override
	public ResponseEntity<?> deleteItems(int id) {
		itemsRepo.deleteById(id);
		return  ResponseEntity.ok().body("Deleted Successfully");
	}
	
}
