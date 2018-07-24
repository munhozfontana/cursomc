package com.udemy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.cursomc.domain.CategoriaDomain;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDomain, Integer>{

}
