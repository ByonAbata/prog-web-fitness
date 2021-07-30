package com.fitness.backend.modls.entities;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona {
	
	
	
	@Column(name="nombre_var")
	private String nombre;
	
	@Column(name="edad_var")
	private int edad;
	
	@Column(name="peso_var")
	private float peso;
	
	@Column(name="altura_var")
	private float altura;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	} 
	
	
    
	
}
