package com.friendlybear.worldinpictures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WorldInPicturesApplication {

	@Value("${environment.name}")
	private String environmentName;

	private static final Logger LOG = LoggerFactory.getLogger(WorldInPicturesApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(WorldInPicturesApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		LOG.info("Application initialized. Environment = {}", environmentName);
	}
}
