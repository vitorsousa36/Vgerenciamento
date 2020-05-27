package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.system.repository.UsuarioRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/login" )
	public String inicio() {
		return "login";
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/efetuarlogin")
	public String salvar(String usuario) {
		usuarioRepository.findByNomeUsuario(usuario);
		
		return "login";
	}
}
