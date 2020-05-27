package com.system.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.system.model.Usuario;
import com.system.repository.UsuarioRepository;

import lombok.Getter;
import lombok.Setter;

@Controller
@Entity
public class UsuarioController {
	
	
	
	@Getter
	@Setter
	private List<Usuario> usuarios;
	
	@Getter
	@Setter
	private Usuario usuario = new Usuario();
	
	@Getter
	@Setter
	private boolean modoEdicao = false;

	
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastrousuario" )
	public String inicio() {
		return "cadastro/cadastrousuario";
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/salvarusuario")
	public String salvar(Usuario usuario) {
		usuarioRepository.save(usuario);
		
		return "cadastro/cadastrousuario";
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/deletarusuario")
	public String deletar(Usuario usuario) {
		
		usuarioRepository.delete(usuario);
		return"consultar/consultarusuario";
		
	}
	 @RequestMapping(method = RequestMethod.GET,value = "/listarusuario")
     public String listaLivros(@PathVariable("nomeUsuario") String usuario, Model model) {
           List<Usuario> listaUsuario = usuarioRepository.findByNomeUsuario(usuario);
           if (listaUsuario != null) {
                 model.addAttribute("usuarios", listaUsuario);
           }
           return "consultar/consultarusuario";
	 }
	
}
