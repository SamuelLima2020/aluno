package br.sp.gov.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.sp.gov.aluno.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
