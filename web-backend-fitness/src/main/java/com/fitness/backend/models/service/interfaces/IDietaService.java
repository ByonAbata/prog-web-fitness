package com.fitness.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fitness.backend.modls.entities.Dieta;

public interface IDietaService {
	// La interface del servicio, sirve para definir el conjunto de métodos que 
	//se van a implementar para la Gestión del modelo-entidad
	
	public void save(Dieta dieta);//Guardar -> Create / Update 
	public Optional<Dieta> findById(Integer id); // Consultar -> Retrieve
	public void delete(Integer id); // Borrar -> Delete
	public List<Dieta> findAll(); // Consultar en conjuto -> List
	

}
