package com.exercicios.exercicios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_respostas")
public class Respostas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long respostasId;
	
	@NotNull
	private Long perguntasId;
	
	@NotNull
	private String respostas;
	
	@NotNull
	private String nomesAlunos;

	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}

	public String getNomesAlunos() {
		return nomesAlunos;
	}

	public void setNomesAlunos(String nomesAlunos) {
		this.nomesAlunos = nomesAlunos;
	}
}
