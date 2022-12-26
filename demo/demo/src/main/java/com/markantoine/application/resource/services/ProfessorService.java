package com.markantoine.application.resource.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markantoine.application.entities.Professor;
import com.markantoine.application.repositories.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;
	
	public List<Professor> findAll(){
		return repository.findAll();
	}
}
