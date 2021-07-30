package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IMenorDeEdadService;
import com.fitness.backend.modls.entities.MenorDeEdad;
import com.fitness.backend.repositories.IMenorDeEdad;



@Service
public class MenorDeEdadService implements IMenorDeEdadService {

	@Autowired 
	IMenorDeEdad repository; 
	
	@Override
	public void save(MenorDeEdad menor) {
		repository.save(menor);
		
	}

	@Override
	public Optional<MenorDeEdad> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<MenorDeEdad> findAll() {
		return (List<MenorDeEdad>)repository.findAll();
	}
	

}
