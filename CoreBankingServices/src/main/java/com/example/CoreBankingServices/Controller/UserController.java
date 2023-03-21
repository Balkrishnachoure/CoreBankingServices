package com.example.CoreBankingServices.Controller;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CoreBankingServices.Service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/account")
public class UserController<T> {

	

	@Autowired
	private UserService userService;

	@GetMapping("/{identification}")
	public T readuser(@PathVariable("identification") String identification) {
		return (T) userService.readuser(identification);
	}

	
	@GetMapping()
	public T readuser(Pageable pageable)
	{
		return (T) userService.readUsers(pageable);
	}
	
	
	
}
