package com.account.mappers;

import org.springframework.stereotype.Component;

import com.account.models.User;
import com.account.pojo.UserRequestDto;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class UserMapper extends ConfigurableMapper {

	@Override
	protected void configure(MapperFactory factory) {
		
		factory.classMap(UserRequestDto.class, User.class)
		.field("email", "email")
		.field("name", "name")
		.field("gender", "gender")
		.register();
		
		super.configure(factory);
	}
}
