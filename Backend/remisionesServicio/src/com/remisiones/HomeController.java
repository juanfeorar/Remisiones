package com.remisiones;

import org.springframework.jdbc.core.JdbcTemplate;

public class HomeController {
	private JdbcTemplate jdbcTemplate;
	public HomeController(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

}
