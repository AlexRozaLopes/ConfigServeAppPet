package br.com.uniceplac.pet.configServeAppPet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServeAppPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServeAppPetApplication.class, args);
	}

}
