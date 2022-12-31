package com.markantoine.application.resource.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markantoine.application.entities.Professor;
import com.markantoine.application.repositories.ProfessorRepository;
import com.markantoine.application.resource.services.exceptions.ObjectNotFoundException;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;
	
	public List<Professor> findAll(){
		return repository.findAll();
	}
	public Professor findById(String id) {
		Optional<Professor> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado") );
	}
	
	public Professor insert(Professor obj){
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Professor update(Professor obj) {
		Professor newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	
	private void updateData(Professor newObj, Professor obj) {
		newObj.setNome(obj.getNome());
		newObj.setTurno(obj.getTurno());
	}
}

