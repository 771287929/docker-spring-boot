package com.zhouwei;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhouwei.model.UserInfo;


@RestController
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("")
	public String hello() {
		return "Hello! Docker!";
	}

	@RequestMapping("/time")
	public String nowtime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	@RequestMapping(method = RequestMethod.POST,value = "/user")
	public UserInfo save(@RequestBody UserInfo user) {
		user.setUsername("周威");
		return  user;
	}

}
