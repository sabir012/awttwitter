package com.example.awtsocialnetwork;

import com.example.awtsocialnetwork.entity.TwitterUserEntity;
import com.example.awtsocialnetwork.repository.FilterRepository;
import com.example.awtsocialnetwork.repository.TwitterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.awtsocialnetwork.controller")
@EnableTransactionManagement
@EnableScheduling
@EntityScan(basePackages = "com.example.awtsocialnetwork.entity")
@EnableJpaRepositories(basePackages = "com.example.awtsocialnetwork.repository")
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private TwitterUserRepository repo;

	@Autowired
	private FilterRepository filterRepo;


	@Override
	public void run(String... args) {
		// repo.save(new TwitterUserEntity("Sabir Alizada","S.Alizada"));
		// repo.save(new TwitterUserEntity("Donald Trump","D.Trump"));
		// repo.save(new TwitterUserEntity("Robert Dony Jumior","R.D.Junior"));

		// System.out.println("New users wwere saved...");

		for (TwitterUserEntity user: repo.findAll()) {
			System.out.println(user.getFullName());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
