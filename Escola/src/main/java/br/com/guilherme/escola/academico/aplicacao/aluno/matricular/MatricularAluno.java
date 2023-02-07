package br.com.guilherme.escola.academico.aplicacao.aluno.matricular;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;
import br.com.guilherme.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.guilherme.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.guilherme.escola.academico.dominio.aluno.AlunoMatriculado;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;
    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void matricular(MatricularAlunoDto dadosAluno) {
        Aluno novo = dadosAluno.criarAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }
}
