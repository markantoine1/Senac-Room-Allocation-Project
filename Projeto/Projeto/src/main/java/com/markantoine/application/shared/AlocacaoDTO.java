package com.markantoine.application.shared;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.markantoine.application.model.Curso;
import com.markantoine.application.model.Professor;

public class AlocacaoDTO {
	private String id;
	private String sala;
	private Date date;
	private String turno;
	
	@DBRef
	private Professor professor;
	
	@DBRef
	private Curso curso;

	public AlocacaoDTO() {
	}
	
	public AlocacaoDTO(String id, String sala, Date date, String turno, Professor professor, Curso curso) {
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
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
		AlocacaoDTO other = (AlocacaoDTO) obj;
		return Objects.equals(id, other.id);
	}
	
}
