package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IEjercicioService;
import com.fitness.backend.modls.entities.Ejercicio;
import com.fitness.backend.repositories.IEjercicio;

@Service
public class EjercicioService implements IEjercicioService{
	
	@Autowired
    IEjercicio repository;
	
	@Override
	public void save(Ejercicio ejercicio) {
		repository.save(ejercicio);
		
	}

	@Override
	public Optional<Ejercicio> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Ejercicio> findAll() {
		return (List<Ejercicio>) repository.findAll();
	}

}
