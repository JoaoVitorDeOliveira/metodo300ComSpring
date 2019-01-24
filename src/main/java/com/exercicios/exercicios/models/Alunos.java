package com.exercicios.exercicios.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cadastro_alunos")
public class Alunos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod;

	private long ra;

	private String nome;

	private String senha;

	public String getNome() {
		return nome;
	}

	public Long getCod() {
		return this.cod;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
