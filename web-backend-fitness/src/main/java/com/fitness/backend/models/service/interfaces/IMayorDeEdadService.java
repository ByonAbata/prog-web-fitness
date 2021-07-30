package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.MayorDeEdad;

public interface IMayorDeEdadService {
	
	public void save(MayorDeEdad mayor);
	public Optional<MayorDeEdad> findById(Integer id);
	public void delete(Integer id);
	public List<MayorDeEdad> findAll();

}
