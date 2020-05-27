package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.Estoque;

@Repository
@Transactional
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

	
//	List<Estoque>findbyMaterial(String material);
}
