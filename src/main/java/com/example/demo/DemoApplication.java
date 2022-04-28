package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("Mickey", "Minnie", "Donald", "Goofy", "Max").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@disney.com", name);
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
