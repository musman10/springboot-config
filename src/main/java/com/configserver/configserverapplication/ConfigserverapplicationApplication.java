package com.configserver.configserverapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverapplicationApplication.class, args);
	}

}
