package com.example.Cursos;

import org.springframework.boot.SpringApplication;

public class TestCursosApplication {

	public static void main(String[] args) {
		SpringApplication.from(CursosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
