package com.hcoelho.molegame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcoelho.molegame.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}