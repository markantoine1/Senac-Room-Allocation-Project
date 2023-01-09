package com.markantoine.application.view.model.request;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.markantoine.application.view.model.response.ProfessorResponse;

public class AlocacaoRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String sala;
	private Date date;
	private String turno;
	
	private ProfessorRequest professor;
	
	private CursoRequest curso;

	public AlocacaoRequest() {
	}
	
	public AlocacaoRequest(String id, String sala, Date date, String turno, ProfessorRequest professor, CursoRequest curso) {
		this.id = id;
		this.sala = sala;
		this.date = date;
		this.turno = turno;
		this.professor = professor;
		this.curso = curso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public ProfessorRequest getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorRequest professor) {
		this.professor = professor;
	}

	public CursoRequest getCurso() {
		return curso;
	}

	public void setCurso(CursoRequest curso) {
		this.curso = curso;
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
		AlocacaoRequest other = (AlocacaoRequest) obj;
		return Objects.equals(id, other.id);
	}
}
