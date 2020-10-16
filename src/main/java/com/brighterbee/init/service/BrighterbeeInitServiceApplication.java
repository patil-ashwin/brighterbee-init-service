package com.brighterbee.init.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BrighterbeeInitServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BrighterbeeInitServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Brighterbee init service started....");	
		Thread.sleep(10000);
		log.info("Brighterbee init service completed....");		
	}

}
