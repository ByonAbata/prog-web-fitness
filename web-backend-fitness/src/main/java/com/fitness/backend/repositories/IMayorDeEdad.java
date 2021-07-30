package com.fitness.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fitness.backend.modls.entities.MayorDeEdad;
                                   //El modelo-entidad al que se quiere vinvular la gestión
                                   // El tipo de dato del atributo que representa la PK del modelo-entidad
public interface IMayorDeEdad extends CrudRepository<MayorDeEdad, Integer> {
	//Tambien es conocido como el Data Acess Object - DAD

}
