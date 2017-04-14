package avs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("avs.pojo")
@EnableJpaRepositories("avs.repository")
public class AVS {
	public static void main(String[] args) {
		SpringApplication.run(AVS.class, args);
	}
}