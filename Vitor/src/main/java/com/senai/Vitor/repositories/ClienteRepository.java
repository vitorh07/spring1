package com.senai.Vitor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Vitor.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
