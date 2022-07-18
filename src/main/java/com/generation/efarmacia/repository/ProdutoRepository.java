package com.generation.efarmacia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.efarmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
