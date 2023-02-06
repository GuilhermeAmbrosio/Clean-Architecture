package br.com.guilherme.escola.aplicacao.aluno.matricular;

import br.com.guilherme.escola.dominio.aluno.Aluno;
import br.com.guilherme.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void matricular(MatricularAlunoDto dadosAluno) {
        Aluno novo = dadosAluno.criarAluno();
        repositorio.matricular(novo);
    }
}
