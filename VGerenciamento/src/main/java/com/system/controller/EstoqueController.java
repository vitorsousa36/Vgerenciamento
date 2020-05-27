package com.system.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.system.model.Estoque;
import com.system.repository.EstoqueRepository;

import lombok.Getter;
import lombok.Setter;

@Controller
@Entity
public class EstoqueController {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Getter
	@Setter
	private List<Estoque> usuarios;
	
	@Getter
	@Setter
	private Estoque estoque = new Estoque();
	
	@Getter
	@Setter
	private boolean modoEdicao = false;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastroestoque" )
	public String inicio() {
		return "cadastro/cadastroestoque"; 
	}

	@RequestMapping(method =RequestMethod.POST, value="/salvarestoque")
	public String salvar(Estoque estoque) {
		estoqueRepository.save(estoque);
		
		return "cadastro/cadastroestoque";
	}
	
}
