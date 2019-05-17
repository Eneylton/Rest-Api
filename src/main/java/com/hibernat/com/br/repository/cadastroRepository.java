package com.hibernat.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernat.com.br.Model.Categoria;

@Repository
public interface cadastroRepository extends JpaRepository<Categoria, Integer> {

}
