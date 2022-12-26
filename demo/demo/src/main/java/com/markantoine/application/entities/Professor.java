package com.markantoine.application.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.markantoine.application.entities.enums.Turno;


@Document
public class Professor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	
	private Integer turno;
	
	public Professor() {
	}

	public Professor(String id, String nome, Turno turno) {
		super();
		this.id = id;
		this.nome = nome;
		setTurno(turno);;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turno getTurno() {
		return Turno.valueOf(this.turno);
	}

	public void setTurno(Turno turno) {
		if(turno != null) {
		this.turno = turno.getCode();
	}}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(id, other.id);
	}

}
