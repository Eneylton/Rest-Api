package com.hibernat.com.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernat.com.br.Model.Categoria;
import com.hibernat.com.br.repository.cadastroRepository;

@Service
public class categoriaService {

	@Autowired
	private cadastroRepository repos;
	
	public Categoria buscarPorID(Integer id) {
		
		Optional<Categoria> cat = repos.findById(id);
		
		return cat.orElse(null);
	}
}
