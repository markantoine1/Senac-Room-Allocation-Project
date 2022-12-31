package com.markantoine.application.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.markantoine.application.entities.Alocacao;
import com.markantoine.application.entities.Curso;
import com.markantoine.application.entities.Professor;
import com.markantoine.application.repositories.AlocacaoRepository;
import com.markantoine.application.repositories.CursoRepository;
import com.markantoine.application.repositories.ProfessorRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private AlocacaoRepository alocacaoRepository;
	
	@Override
	public void run(String... args) throws Exception {		
		
		professorRepository.deleteAll();
		cursoRepository.deleteAll();
		alocacaoRepository.deleteAll();
		
		Professor p1 = new Professor(null, "Joao", "Manhã");
		professorRepository.save(p1);
		
		Curso c1 = new Curso(null, "Técnico em Enfermagem", "Tarde");
		cursoRepository.save(c1);
		
		Alocacao a1 = new Alocacao(null, "01 - Térreo", new Date(), "Tarde", p1, c1);
		alocacaoRepository.save(a1);
	}

}
