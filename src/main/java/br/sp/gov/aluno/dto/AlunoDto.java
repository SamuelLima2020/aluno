package br.sp.gov.aluno.dto;

import java.io.Serializable;
import br.sp.gov.aluno.entity.Aluno;

public class AlunoDto implements Serializable {

	private static final long serialVersionUID = 6451705302635798314L;

	private String nome;
	private String rg;
	private String cpf;
	private int matricula;
	private String email;
	private String data_nasc;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Aluno toEntityAluno() {

		Aluno aluno = new Aluno(nome, rg, cpf, matricula, email, data_nasc);
		return aluno;
	}
}
