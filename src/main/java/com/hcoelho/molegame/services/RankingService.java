package com.hcoelho.molegame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hcoelho.molegame.entities.Ranking;
import com.hcoelho.molegame.repositories.RankingRepository;

@Service
public class RankingService {

	@Autowired
	RankingRepository repo;

	public List<Ranking> todos() {
		return repo.findAll();
	}

	public List<Ranking> newRanking(String nivel) {
		return repo.findTop5ByNivelOrderByPontuacaoDesc(nivel);
	}

	public Ranking novo(Ranking ranking) {
		int aux = 0;
		List<Ranking> todos = todos();
		Integer idUser = ranking.getUsuario().getId();
		Integer pontuacao = ranking.getPontuacao();
		String nivel = ranking.getNivel();

		for (Ranking s : todos) {
			if (s.getUsuario().getId() == idUser && s.getPontuacao() == pontuacao && s.getNivel().equals(nivel)) {
				aux++;
			}
		}
		if (aux == 0)
			return repo.save(ranking);
		else
			System.out.println("Pontuação já existe!");
		return ranking;
	}
}