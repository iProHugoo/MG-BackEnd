package com.hcoelho.molegame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcoelho.molegame.entities.Ranking;
import com.hcoelho.molegame.services.RankingService;

@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	RankingService service;

	@CrossOrigin
	@GetMapping
	public List<Ranking> listaPorNivel2(@RequestParam String nivel) {
		return service.newRanking(nivel);
	}

	@CrossOrigin
	@PostMapping
	public Ranking registerRanking(@RequestBody Ranking ranking) {
		return service.novo(ranking);
	}
}