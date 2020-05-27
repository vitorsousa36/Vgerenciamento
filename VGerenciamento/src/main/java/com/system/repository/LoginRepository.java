package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.Usuario;

@Repository
@Transactional
public interface LoginRepository extends JpaRepository<Usuario, Long > {

}
