package com.hibernat.com.br;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernat.com.br.Model.Categoria;
import com.hibernat.com.br.repository.cadastroRepository;

@SpringBootApplication
public class CrudHibernatApplication implements CommandLineRunner {

	@Autowired
	private cadastroRepository repos;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudHibernatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        
		Categoria cat1 = new Categoria(null,"Alimentação");
		Categoria cat2 = new Categoria(null,"Pereciveis");
		
		repos.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
