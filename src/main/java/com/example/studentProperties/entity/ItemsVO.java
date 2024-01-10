package com.example.studentProperties.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studentItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String accessories;
	private String toys;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "Stud_id")
	StudentDetailsVO studDetails;
	
}
