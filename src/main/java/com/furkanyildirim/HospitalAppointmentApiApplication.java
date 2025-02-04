package com.furkanyildirim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class HospitalAppointmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalAppointmentApiApplication.class, args);
	}

}
