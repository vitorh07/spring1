package com.senai.Vitor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "cliente")
	private String cliente;
	
	@Column(name = "fone")
	private String fone;
	
	//métodos da classe
	public Long getIdcCliente() {
		return idcCliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public void setName(String cliente) {
		this.cliente = cliente;
	}
	public void setPrice(String fone) {
		this.fone = fone;
	}
}