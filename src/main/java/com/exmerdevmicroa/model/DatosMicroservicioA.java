package com.exmerdevmicroa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datosmicroa")
public class DatosMicroservicioA {
	//email y pass
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String pass;
	
	
	public DatosMicroservicioA(Integer id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}
	public DatosMicroservicioA() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "DatosMicroservicioA [id=" + id + ", email=" + email + ", pass=" + pass + "]";
	}
	
}
