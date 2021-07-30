package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.Instrumento;

public interface IinstrumentoService { 
	
	public void save(Instrumento instrumento);
	public Optional<Instrumento> findById(Integer id);
	public void delete (Integer id);
	public List<Instrumento> findAll();

}
