package com.markantoine.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.markantoine.application.entities.Alocacao;

@Repository
public interface AlocacaoRepository extends MongoRepository<Alocacao, String>{

}
