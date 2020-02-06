package com.account.pojo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.account.enums.Gender;

import lombok.Data;

@Data
public class UserRequestDto {
	
	@NotEmpty(message = "Non Empty")
	@Size(min = 2, max = 20)
	private String name;
	
	@NotEmpty(message = "Not Empty")
	private String email;
	
	private Gender gender;
	
}
