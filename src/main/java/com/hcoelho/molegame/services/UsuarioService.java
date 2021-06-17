package com.hcoelho.molegame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.molegame.entities.Usuario;
import com.hcoelho.molegame.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repo;

	public List<Usuario> todos() {
		return repo.findAll();
	}

	public Usuario novo(Usuario usuario) {
		return repo.save(usuario);
	}
}