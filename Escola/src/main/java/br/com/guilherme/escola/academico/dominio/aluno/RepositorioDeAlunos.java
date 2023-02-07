package br.com.guilherme.escola.academico.dominio.aluno;

import br.com.guilherme.escola.shared.dominio.Cpf;

import java.util.List;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
