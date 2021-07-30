package com.fitness.backend.modls.entities;



import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dietas")
public class Dieta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_dieta_var")
	private Integer idDieta;
	
	@Column(name="alimento_var")
	private String alimento;
	
	@Column(name="horario_var")
	private Calendar horario;
	
	@Column(name="porcion_var")//gramos 
	private float porcion;
	
	@JoinColumn(name= "id_progrma_fitness", referencedColumnName = "id_progrma_fitness")
	@ManyToOne
	private ProgramaFitness programafitness;
	
	public Dieta() {
		super();
	} 
	
	public Dieta(Integer idDieta) {
		super();
		this.idDieta = idDieta;
	}

	public Integer getIdDieta() {
		return idDieta;
	}

	public void setIdDieta(Integer idDieta) {
		this.idDieta = idDieta;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public float getPorcion() {
		return porcion;
	}

	public void setPorcion(float porcion) {
		this.porcion = porcion;
	}

	public ProgramaFitness getProgramafitness() {
		return programafitness;
	}

	public void setProgramafitness(ProgramaFitness programafitness) {
		this.programafitness = programafitness;
	} 
	
	
	
	

}
