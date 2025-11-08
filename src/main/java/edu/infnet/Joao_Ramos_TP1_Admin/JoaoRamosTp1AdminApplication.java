package edu.infnet.Joao_Ramos_TP1_Admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class JoaoRamosTp1AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoaoRamosTp1AdminApplication.class, args);
	}

}
