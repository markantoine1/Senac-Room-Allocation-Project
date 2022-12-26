package com.markantoine.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.markantoine.application.entities.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, String>{

}
