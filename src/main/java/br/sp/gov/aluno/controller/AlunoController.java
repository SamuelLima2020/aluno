package br.sp.gov.aluno.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import br.sp.gov.aluno.dto.AlunoDto;
import br.sp.gov.aluno.entity.Aluno;
import br.sp.gov.aluno.service.AlunoService;

@Controller
@RequestMapping("/api/aluno")
public class AlunoController {

	@Autowired
	AlunoService service;

	@PostMapping
	public ResponseEntity<?> cadastrarAluno(@RequestBody AlunoDto dto) {

		Aluno aluno = service.cadastrarAluno(dto);
		return ResponseEntity.status(HttpStatus.OK).body(aluno);
	}

	@GetMapping
	public ResponseEntity<?> listarAluno() {

		List<Aluno> alunos = service.listarAluno();
		return ResponseEntity.status(HttpStatus.OK).body(alunos);

	}
}