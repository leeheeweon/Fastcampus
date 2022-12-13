package com.example.mvcpractice;

import org.apache.catalina.LifecycleException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class MvcPracticeApplication {

	public static void main(String[] args) throws LifecycleException {
		SpringApplication.run(MvcPracticeApplication.class, args);
	}

}
