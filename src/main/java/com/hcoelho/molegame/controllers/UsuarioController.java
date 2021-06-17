package com.hcoelho.molegame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcoelho.molegame.entities.Usuario;
import com.hcoelho.molegame.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@CrossOrigin
	@GetMapping
	public List<Usuario> listaTodos() {
		return service.todos();
	}

	@CrossOrigin
	@PostMapping
	public Usuario cadastra(@RequestBody Usuario usuario) {
		return service.novo(usuario);
	}
}