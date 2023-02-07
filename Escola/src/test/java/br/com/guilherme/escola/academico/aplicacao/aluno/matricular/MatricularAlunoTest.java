package br.com.guilherme.escola.academico.aplicacao.aluno.matricular;

import br.com.guilherme.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.guilherme.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.guilherme.escola.academico.dominio.PublicadorDeEventos;
import br.com.guilherme.escola.academico.dominio.aluno.Aluno;
import br.com.guilherme.escola.academico.dominio.aluno.Cpf;
import br.com.guilherme.escola.academico.infraestrutura.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        PublicadorDeEventos publicador = new PublicadorDeEventos();
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
        MatricularAlunoDto dadosAluno = new MatricularAlunoDto("Teste", "123.456.789-00", "teste@email.com");
        useCase.matricular(dadosAluno);
        Cpf cpf = new Cpf("123.456.789-00");
        Aluno aluno = repositorio.buscarPorCPF(cpf);

        Assertions.assertEquals("123.456.789-00", aluno.getCpf().getNumero());
        Assertions.assertEquals(cpf.getNumero(), aluno.getCpf().getNumero());
        Assertions.assertEquals("Teste", aluno.getNome());
        Assertions.assertEquals("teste@email.com", aluno.getEmail());
    }
}
