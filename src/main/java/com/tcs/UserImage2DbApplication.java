package com.tcs;

import com.tcs.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserImage2DbApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cntxt=SpringApplication.run(UserImage2DbApplication.class, args);
		UserService userService=cntxt.getBean(UserService.class);
		userService.saveUser();
	}
}
