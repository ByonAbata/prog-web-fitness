package com.fitness.backend.modls.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mayores_de_edad")
public class MayorDeEdad extends Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_mayor_de_edad")
	private Integer idMayorDeEdad;
	
	@Column(name="profesion_var")
	private String profesion;
	
	@JoinColumn(name="id_progrma_fitness", nullable= false)
	@OneToOne( fetch = FetchType.LAZY)
	private ProgramaFitness programafitness;
	
	public MayorDeEdad() {
		super();
	} 
	
	public MayorDeEdad(Integer idMayorDeEdad) {
		super();
		this.idMayorDeEdad = idMayorDeEdad;
	}

	public Integer getIdMayorDeEdad() {
		return idMayorDeEdad;
	}

	public void setIdMayorDeEdad(Integer idMayorDeEdad) {
		this.idMayorDeEdad = idMayorDeEdad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public ProgramaFitness getProgramafitness() {
		return programafitness;
	}

	public void setProgramafitness(ProgramaFitness programafitness) {
		this.programafitness = programafitness;
	}  
	
	
	
	

}
