package com.system.VGerenciamento;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages ="com.system.model")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.system.repository"})
@EnableTransactionManagement
public class VGerenciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VGerenciamentoApplication.class, args);
		
//		EntityManagerFactory emf = 
	}

}
