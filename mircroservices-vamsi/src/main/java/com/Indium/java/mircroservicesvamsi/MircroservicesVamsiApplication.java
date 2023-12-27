package com.Indium.java.mircroservicesvamsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MircroservicesVamsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircroservicesVamsiApplication.class, args);
	}

}
