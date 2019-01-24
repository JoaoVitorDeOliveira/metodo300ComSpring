package com.exercicios.exercicios.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicios.exercicios.models.Alunos;
import com.exercicios.exercicios.models.Disciplinas;
import com.exercicios.exercicios.repository.AlunosServices;
import com.exercicios.exercicios.repository.DisciplinasServices;

@RestController
@RequestMapping(value = "/metodo300")
public class EventoResource {

	@Autowired
	private AlunosServices alunosServices;

	@Autowired
	private DisciplinasServices disciplinasServices;

	@GetMapping(value = "/alunos")
	public @ResponseBody List<Alunos> listarAlunos() {
		return alunosServices.findAll();
	}

	@GetMapping(value = "/alunos")
	public @ResponseBody List<Alunos> listarAlunosComLink() {
		List<Alunos> alunos = alunosServices.findAll();
		// alunos.forEach(aluno -> {
		// aluno.add(linkTo(methodOn(EventoResource.class).listarAlunosComLink()).withSelfRel());
		// });

		return alunos;
	}

	@GetMapping(value = "/alunos/{id}")
	public @ResponseBody Alunos listarAluno(@PathVariable("id") Long id) {
		return alunosServices.findById(id).get();
	}

	@GetMapping(value = "/disciplinas")
	public @ResponseBody List<Disciplinas> listarDisciplinas() {
		return disciplinasServices.findAll();
	}

	@PostMapping(value = "/cadastrarAluno")
	public Alunos cadastrarAluno(@RequestBody @Valid Alunos alunos) {
		return alunosServices.save(alunos);
	}

	@PostMapping(value = "/cadastrarDisciplina")
	public Disciplinas cadastrarDisciplina(@RequestBody @Valid Disciplinas disciplinas) {
		return disciplinasServices.save(disciplinas);
	}

	@DeleteMapping()
	public Alunos deletarAluno(@RequestBody Alunos alunos) {
		alunosServices.delete(alunos);
		return alunos;
	}
}
