package com.markantoine.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.markantoine.application.model.Professor;

@Repository
public interface ProfessorRepository extends MongoRepository<Professor, String>{

}
