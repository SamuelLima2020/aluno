package br.sp.gov.aluno.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.sp.gov.aluno.dto.AlunoDto;
import br.sp.gov.aluno.entity.Aluno;
import br.sp.gov.aluno.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository repository;

	public Aluno cadastrarAluno(AlunoDto dto) {
		Aluno aluno = repository.save(dto.toEntityAluno());
		return aluno;
	}

	public List<Aluno> listarAluno() {
		List<Aluno> alunos = repository.findAll();
		return alunos;
	}
}
