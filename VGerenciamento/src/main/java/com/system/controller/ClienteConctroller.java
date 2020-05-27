package com.system.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.system.model.Cliente;
import com.system.model.Fornecedor;
import com.system.model.Usuario;
import com.system.repository.ClienteRepository;

import lombok.Getter;
import lombok.Setter;
@Entity
@Controller
public class ClienteConctroller {


	@Autowired
	private ClienteRepository clienteRepository;

	@Setter
	@Getter
	private List<Cliente> clientes;
	@Setter
	@Getter
	private Cliente cliente = new Cliente();
	@Setter
	@Getter
	private boolean modoEdicao = false;
	@Setter
	@Getter
	private Usuario contato = new Usuario();

	@PostConstruct
	public void init() {
		setClienteRepository(clienteRepository.findAll());
	}

	private void setClienteRepository(List<Cliente> findAll) {
		// TODO Auto-generated method stub
		
	}

	public void salvar() {

		clienteRepository.save(cliente);
		if (!isModoEdicao())
			clientes.add(cliente);
		cliente = new Cliente();
		setModoEdicao(false);
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
		clientes.remove(cliente);
	}

	public void editar(Cliente cliente) {
		setClienteRepository(cliente);
		setModoEdicao(true);
	}

	private void setClienteRepository(Cliente cliente2) {
		// TODO Auto-generated method stub
		
	}

	public void cancelar() {
		cliente = new Cliente();
		setModoEdicao(false);
	}

	private void setModoEdicao(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void adicionarCliente() {

		Usuario.setCliente(cliente);
		contato = new Usuario();

	}

	public void excluirContato(Fornecedor contato) {

	}

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}
	
}	
	
