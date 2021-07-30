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
@Table(name="intrumento")
public class Instrumento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_instrumento_var")
	private Integer idInstrumento;
	
	@Column(name="nombre_var")
	private String nombre;
	
	@Column(name="marca_var")
	private String marca;
	
	@Column(name="caracteristica_var")
	private String caracteristica;
	
	@JoinColumn(name="id_ejercicio_var", nullable= false)
	@OneToOne( fetch = FetchType.LAZY)
	private Ejercicio apoyo;
	
	public Instrumento() {
		super();
	}
	
	

	public Instrumento(Integer idInstrumento) {
		super();
		this.idInstrumento = idInstrumento;
	}



	public Integer getIdInstrumento() {
		return idInstrumento;
	}

	public void setIdInstrumento(Integer idInstrumento) {
		this.idInstrumento = idInstrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public Ejercicio getApoyo() {
		return apoyo;
	}

	public void setApoyo(Ejercicio apoyo) {
		this.apoyo = apoyo;
	} 
	
		

}
