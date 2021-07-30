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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ejercicios")
public class Ejercicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_ejercicio_var")
	private Integer idEjercicio;
	
	@Column(name="descripcion_var")
	private String descripcion;
	
	@Column(name="series_Var")
	private int series;
	
	@Column(name="repeticiones_var")
	private int repeticiones; 
	
	@Column(name="fecha_var")
	private Calendar fecha;
	
	@Column(name="enfoque_corporal_var")
	private String enfoqueCorporal;
	
	@JoinColumn(name= "id_progrma_fitness", referencedColumnName = "id_progrma_fitness")//Se mapea con una clave foránea 
	@ManyToOne //representa la relacion (de uno a muchos) partiendo de la clase
	private ProgramaFitness programafitness;
	
	@OneToOne(mappedBy = "apoyo")
	private Instrumento instrumento;
	
	public Ejercicio() {
		super();
	} 
	
	public Ejercicio(Integer idEjercicio) {
		super();
		this.idEjercicio = idEjercicio;
	}

	public Integer getIdEjercicio() {
		return idEjercicio;
	}

	public void setIdEjercicio(Integer idEjercicio) {
		this.idEjercicio = idEjercicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getEnfoqueCorporal() {
		return enfoqueCorporal;
	}

	public void setEnfoqueCorporal(String enfoqueCorporal) {
		this.enfoqueCorporal = enfoqueCorporal;
	}

	public ProgramaFitness getProgramafitness() {
		return programafitness;
	}

	public void setProgramafitness(ProgramaFitness programafitness) {
		this.programafitness = programafitness;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}  
	
	
	
	
	

}
