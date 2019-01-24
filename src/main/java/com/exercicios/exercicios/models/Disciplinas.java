package com.exercicios.exercicios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_disciplinas")
public class Disciplinas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long disciplinasId;

	private String disciplinas;

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
}
