package com.markantoine.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.markantoine.application.model.Curso;

@Repository
public interface CursoRepository extends MongoRepository<Curso, String>{

}
