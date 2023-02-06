package br.com.guilherme.escola.aplicacao.aluno.matricular;

import br.com.guilherme.escola.dominio.aluno.Aluno;
import br.com.guilherme.escola.dominio.aluno.Cpf;
import br.com.guilherme.escola.infraestrutura.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDto dadosAluno = new MatricularAlunoDto("Teste", "123.456.789-00", "teste@email.com");
        useCase.matricular(dadosAluno);

        Aluno aluno = repositorio.buscarPorCPF(new Cpf("123.456.789-00"));

        Assertions.assertEquals("123.456.789-00", aluno.getCpf());
        Assertions.assertEquals("Teste", aluno.getNome());
        Assertions.assertEquals("teste@email.com", aluno.getEmail());
    }
}
