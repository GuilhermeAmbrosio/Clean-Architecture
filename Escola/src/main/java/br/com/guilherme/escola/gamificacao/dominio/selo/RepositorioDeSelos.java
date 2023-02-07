package br.com.guilherme.escola.gamificacao.dominio.selo;

import br.com.guilherme.escola.shared.dominio.Cpf;

import java.util.List;

public interface RepositorioDeSelos {

    void criarSelo(Selo selo);
    List<Selo> buscarSeloPorCpfDoAluno(Cpf cpf);
}
