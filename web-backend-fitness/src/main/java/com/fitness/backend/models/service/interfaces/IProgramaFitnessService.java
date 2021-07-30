package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.ProgramaFitness;

public interface IProgramaFitnessService {
	
	public void save(ProgramaFitness fitness);
	public Optional<ProgramaFitness> findByID(Integer id);
	public void delete(Integer id);
	public List<ProgramaFitness> findAll();

}
