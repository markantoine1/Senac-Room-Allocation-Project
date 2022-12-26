package com.markantoine.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.markantoine.application.entities.Professor;
import com.markantoine.application.entities.enums.Turno;
import com.markantoine.application.repositories.ProfessorRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private ProfessorRepository professorRepository;
	
	@Override
	public void run(String... args) throws Exception {		
		professorRepository.deleteAll();
		
		Professor p1 = new Professor(null, "Joao", Turno.MANHÃ);
		
		professorRepository.save(p1);
	}

}
