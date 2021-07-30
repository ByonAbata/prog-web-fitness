package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IinstrumentoService;
import com.fitness.backend.modls.entities.Instrumento;
import com.fitness.backend.repositories.Iinstrumento;

@Service
public class InstrumentoService implements IinstrumentoService {
	
	@Autowired
    Iinstrumento repository;
	
	@Override
	public void save(Instrumento instrumento) {
	    repository.save(instrumento);
		
	}

	@Override
	public Optional<Instrumento> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Instrumento> findAll() {
		return  (List<Instrumento>)repository.findAll();
	}

}
