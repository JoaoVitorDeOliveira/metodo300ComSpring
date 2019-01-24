package com.exercicios.exercicios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_perguntas")
public class Perguntas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long perguntasId;
	
	@NotNull
	private Long disciplinasId;
	
	@NotNull
	private String perguntas;
	
	@NotNull
	private String nomesAlunos;

	public String getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String perguntas) {
		this.perguntas = perguntas;
	}

	public String getNomesAlunos() {
		return nomesAlunos;
	}

	public void setNomesAlunos(String nomesAlunos) {
		this.nomesAlunos = nomesAlunos;
	}
}
