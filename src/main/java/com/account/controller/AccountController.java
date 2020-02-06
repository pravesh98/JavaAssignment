package com.account.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.account.models.ResponseEntity;
import com.account.models.User;
import com.account.pojo.UserRequestDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Accounts controller", description = "Complete Account REST API's wrt user")
public interface AccountController {

	@ApiOperation(value = "Get All User")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully"),
			@ApiResponse(code = 400, message = "UnAuthorized") })
	public ResponseEntity<List<User>> getUsers();

	@ApiOperation(value = "Create User")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully"),
			@ApiResponse(code = 201, message = "User created successfully"),
			@ApiResponse(code = 400, message = "UnAuthorized") })
	public ResponseEntity<User> createUser(@RequestBody UserRequestDto user);

}
