package com.zoro.patientmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("model")
public class PatientmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientmanagementApplication.class, args);
	}

}
