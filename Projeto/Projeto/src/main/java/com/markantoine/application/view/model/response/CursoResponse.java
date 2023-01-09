package com.markantoine.application.view.model.response;

import java.io.Serializable;
import java.util.Objects;

public class CursoResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String turno;
	
	public CursoResponse(){
	}

	public CursoResponse(String id, String nome, String turno) {
		this.id = id;
		this.nome = nome;
		this.turno = turno;
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

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

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
		CursoResponse other = (CursoResponse) obj;
		return Objects.equals(id, other.id);
	}
}
