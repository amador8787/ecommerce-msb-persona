package com.bsoftgroup.springcloudmsbuspersona.objetos;

public class Persona {
	
	private Integer id;
	private String nombres;
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(Integer id, String nombres) {
		super();
		this.id = id;
		this.nombres = nombres;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
	
	

}
