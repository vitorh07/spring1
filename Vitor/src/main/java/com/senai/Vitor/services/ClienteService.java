package com.senai.Vitor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Vitor.entities.Cliente;
import com.senai.Vitor.repositories.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	//listar todos os produtos
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	//apagar produto
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
