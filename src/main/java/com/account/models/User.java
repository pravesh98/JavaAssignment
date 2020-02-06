package com.account.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.account.enums.Gender;

import lombok.Data;

@Data
@Table(name = "users")
@Entity(name = "users")
public class User {
	
	@Id
	private String id;
	
	private String email;
	
	private String name;
	
	private Gender gender;
	
}
