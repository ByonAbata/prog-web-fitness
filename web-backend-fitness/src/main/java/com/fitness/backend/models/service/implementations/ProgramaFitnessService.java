package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IProgramaFitnessService;
import com.fitness.backend.modls.entities.ProgramaFitness;
import com.fitness.backend.repositories.IProgramaFitness;

@Service
public class ProgramaFitnessService implements IProgramaFitnessService{

	@Autowired
	IProgramaFitness repository;
	
	@Override
	public void save(ProgramaFitness fitness) {
		repository.save(fitness);
		
	}

	@Override
	public Optional<ProgramaFitness> findByID(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<ProgramaFitness> findAll() {
		return (List<ProgramaFitness>)repository.findAll();
	}

}
