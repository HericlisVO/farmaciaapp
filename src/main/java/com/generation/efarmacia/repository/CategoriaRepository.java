package com.generation.efarmacia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.efarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
