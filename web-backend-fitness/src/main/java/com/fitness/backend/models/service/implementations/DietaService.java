package com.fitness.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.backend.models.service.interfaces.IDietaService;
import com.fitness.backend.modls.entities.Dieta;
import com.fitness.backend.repositories.IDieta;

@Service
public class DietaService implements IDietaService {
    
	// Sirve para implementar los metodos de gestión, inyectando el DAO
	
	@Autowired
	IDieta repository; // DAO Data Acecess Objet
	
	@Override
	public void save(Dieta dieta) {
		repository.save(dieta);
		
	}

	@Override
	public Optional<Dieta> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
	    repository.deleteById(id);
		
	}

	@Override
	public List<Dieta> findAll() {
		return (List<Dieta>)repository.findAll();
	}
	

}
