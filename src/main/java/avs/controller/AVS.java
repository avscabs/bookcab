package avs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("avs.pojo")
public class AVS {
	public static void main(String[] args) {
		SpringApplication.run(AVS.class, args);
	}
}