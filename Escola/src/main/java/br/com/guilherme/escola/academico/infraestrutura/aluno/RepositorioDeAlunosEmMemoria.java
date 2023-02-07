package br.com.guilherme.escola.academico.infraestrutura.aluno;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;
import br.com.guilherme.escola.academico.dominio.aluno.AlunoNaoEncontrado;
import br.com.guilherme.escola.shared.dominio.Cpf;
import br.com.guilherme.escola.academico.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(Cpf cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().getNumero().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
