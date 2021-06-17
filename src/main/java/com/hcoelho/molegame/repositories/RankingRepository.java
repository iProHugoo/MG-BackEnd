package com.hcoelho.molegame.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcoelho.molegame.entities.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Integer> {

	List<Ranking> findTop5ByNivelOrderByPontuacaoDesc(String nivel);
}