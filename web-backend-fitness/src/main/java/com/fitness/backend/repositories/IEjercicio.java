package com.fitness.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fitness.backend.modls.entities.Ejercicio;

public interface IEjercicio extends CrudRepository<Ejercicio, Integer>{

}
