package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.Ejercicio;

public interface IEjercicioService { 
	
	public void save(Ejercicio ejercicio);
	public Optional<Ejercicio> findById(Integer id);
	public void delete (Integer id);
	public List<Ejercicio> findAll();

}
