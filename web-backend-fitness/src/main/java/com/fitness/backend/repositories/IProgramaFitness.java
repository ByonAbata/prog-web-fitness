package com.fitness.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fitness.backend.modls.entities.ProgramaFitness;

public interface IProgramaFitness extends CrudRepository<ProgramaFitness, Integer> {

}
