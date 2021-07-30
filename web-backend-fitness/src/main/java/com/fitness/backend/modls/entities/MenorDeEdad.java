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
@Table(name="menores_de_edad")
public class MenorDeEdad extends Persona {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_menor_de_edad")
	private Integer idMenorDeEdad; 
	
	@Column(name="tutor_var")
	private String tutor;
    
	
	@JoinColumn(name="id_progrma_fitness", nullable= false)
	@OneToOne( fetch = FetchType.LAZY)
	private ProgramaFitness programafitness;
	
	public MenorDeEdad() {
		super();
	}
	
	public MenorDeEdad(Integer idMenorDeEdad) {
		super();
		this.idMenorDeEdad = idMenorDeEdad;
	}

	public Integer getIdMenorDeEdad() {
		return idMenorDeEdad;
	}

	public void setIdMenorDeEdad(Integer idMenorDeEdad) {
		this.idMenorDeEdad = idMenorDeEdad;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public ProgramaFitness getProgramafitness() {
		return programafitness;
	}

	public void setProgramafitness(ProgramaFitness programafitness) {
		this.programafitness = programafitness;
	} 
	
	
    

}
