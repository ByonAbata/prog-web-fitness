package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IMayorDeEdadService;
import com.fitness.backend.modls.entities.MayorDeEdad;
import com.fitness.backend.repositories.IMayorDeEdad;

@Service
public class MayorDeEdadService implements IMayorDeEdadService{

	@Autowired 
	IMayorDeEdad repository;
	
	@Override
	public void save(MayorDeEdad mayor) {
		repository.save(mayor);
		
	}

	@Override
	public Optional<MayorDeEdad> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<MayorDeEdad> findAll() {
		return (List<MayorDeEdad>)repository.findAll();
	}

}
