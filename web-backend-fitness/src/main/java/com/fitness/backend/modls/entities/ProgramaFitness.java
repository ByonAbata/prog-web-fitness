package com.fitness.backend.modls.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="programas_fitness")
public class ProgramaFitness {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_progrma_fitness")
	private Integer idProgramaFitness;
	
	@Column(name="objetivo_var")
	private String objetivo;
	
	@Column(name="fecha_inicio_var")
	private Calendar fechaIncio;
	
	@Column(name="fecha_fin_var")
	private Calendar fechaFin;
	
	@OneToMany(mappedBy="programafitness", fetch = FetchType.LAZY) //mappedBy va el nombre del atributo de esta clase en la clase asociada
	private List<Ejercicio> Ejercicios; 
	
	@OneToMany(mappedBy="programafitness", fetch = FetchType.LAZY)
	private List<Dieta> Dietas; 
	
	@OneToOne(mappedBy = "programafitness")
	private MenorDeEdad menor;
	
	@OneToOne(mappedBy = "programafitness")
	private MayorDeEdad mayor;
	
	public ProgramaFitness() {
		super();
	} 
	
	public ProgramaFitness(Integer idProgramaFitness) {
		super();
		this.idProgramaFitness = idProgramaFitness;
	}

	public Integer getIdProgramaFitness() {
		return idProgramaFitness;
	}

	public void setIdProgramaFitness(Integer idProgramaFitness) {
		this.idProgramaFitness = idProgramaFitness;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Calendar getFechaIncio() {
		return fechaIncio;
	}

	public void setFechaIncio(Calendar fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Ejercicio> getEjercicios() {
		return Ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		Ejercicios = ejercicios;
	}

	public List<Dieta> getDietas() {
		return Dietas;
	}

	public void setDietas(List<Dieta> dietas) {
		Dietas = dietas;
	}

	public MenorDeEdad getMenor() {
		return menor;
	}

	public void setMenor(MenorDeEdad menor) {
		this.menor = menor;
	}

	public MayorDeEdad getMayor() {
		return mayor;
	}

	public void setMayor(MayorDeEdad mayor) {
		this.mayor = mayor;
	}  
	
	
	
	
	

}
