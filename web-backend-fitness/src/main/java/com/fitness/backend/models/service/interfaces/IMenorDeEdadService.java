package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.MenorDeEdad;

public interface IMenorDeEdadService {
	
	public void save(MenorDeEdad menor);
	public Optional<MenorDeEdad> findById(Integer id);
	public void delete(Integer id); 
	public List<MenorDeEdad> findAll();
	

}
