package com.kh.khdata.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class PokemonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PokemonDao pokemonDao;
	
	//백승연
}
