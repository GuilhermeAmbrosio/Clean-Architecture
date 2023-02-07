package br.com.guilherme.escola.gamificacao.dominio.selo;

import br.com.guilherme.escola.academico.dominio.aluno.Cpf;

import java.util.List;

public interface RepositorioDeSelos {

    void criarSelo(Selo selo);
    List<Selo> buscarSeloPorCpfDoAluno(Cpf cpf);
}
