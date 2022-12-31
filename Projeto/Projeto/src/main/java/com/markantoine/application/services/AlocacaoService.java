package com.markantoine.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markantoine.application.entities.Alocacao;
import com.markantoine.application.repositories.AlocacaoRepository;
import com.markantoine.application.resource.services.exceptions.ObjectNotFoundException;

@Service
public class AlocacaoService {
	
	@Autowired
	private AlocacaoRepository repository;
	
	public List<Alocacao> findAll(){
		return repository.findAll();
	}
	
	public Alocacao findById(String id) {
		Optional<Alocacao> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado") );
	}
	
	public Alocacao insert(Alocacao obj){
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Alocacao update(Alocacao obj) {
		Alocacao newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	
	private void updateData(Alocacao newObj, Alocacao obj) {
		newObj.setCurso(obj.getCurso());;
		newObj.setDate(obj.getDate());
		newObj.setProfessor(obj.getProfessor());
		newObj.setSala(obj.getSala());
		newObj.setTurno(obj.getTurno());
	}
}
