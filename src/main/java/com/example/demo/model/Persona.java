package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("Persona")
public class Persona {
	
	@Id
	private int id;
	
	private String priNombre;
	private String segNombre;
	private String priApell;
	private String segApell;
	private String tel;
	private String email;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String priNombre, String segNombre, String priApell, String segApell, String tel,
			String email) {
		super();
		this.id = id;
		this.priNombre = priNombre;
		this.segNombre = segNombre;
		this.priApell = priApell;
		this.segApell = segApell;
		this.tel = tel;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriNombre() {
		return priNombre;
	}

	public void setPriNombre(String priNombre) {
		this.priNombre = priNombre;
	}

	public String getSegNombre() {
		return segNombre;
	}

	public void setSegNombre(String segNombre) {
		this.segNombre = segNombre;
	}

	public String getPriApell() {
		return priApell;
	}

	public void setPriApell(String priApell) {
		this.priApell = priApell;
	}

	public String getSegApell() {
		return segApell;
	}

	public void setSegApell(String segApell) {
		this.segApell = segApell;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
