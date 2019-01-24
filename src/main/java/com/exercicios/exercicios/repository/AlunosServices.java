package com.exercicios.exercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicios.exercicios.models.Alunos;

public interface AlunosServices extends JpaRepository<Alunos, Long>{

}
