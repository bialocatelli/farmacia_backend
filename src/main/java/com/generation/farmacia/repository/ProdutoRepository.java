package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByTituloContainingIgnoreCase(String nome);
	
		
	
	// SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";


}