package com.account.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.mappers.UserMapper;
import com.account.models.ResponseEntity;
import com.account.models.User;
import com.account.pojo.UserRequestDto;
import com.account.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class AccountControllerV1 implements AccountController {

	private final UserService userService;
	private final UserMapper userMapper;

	@Override
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {

		List<User> users = userService.getUsers();

		return new ResponseEntity<List<User>>(HttpStatus.OK, "all users ", users);
	}

	@Override
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody @Valid UserRequestDto user) {
		User receivedUser = userService.createUser(userMapper.map(user, User.class));

		return new ResponseEntity<User>(HttpStatus.CREATED, "user created", receivedUser);
	}

}
