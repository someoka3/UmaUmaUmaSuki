package com.umaumaumasuki.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table(name = "tbl_m_user")
@Data
public class User {
	
	@Id
	private String id;
	
	private String password;
//	private String createdAt;
//	private String createdBy;
	
}
