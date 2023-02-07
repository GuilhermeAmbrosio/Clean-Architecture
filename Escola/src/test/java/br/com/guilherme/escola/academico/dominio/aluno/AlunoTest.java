package br.com.guilherme.escola.academico.dominio.aluno;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;
import br.com.guilherme.escola.academico.dominio.aluno.Cpf;
import br.com.guilherme.escola.academico.dominio.aluno.Email;
import br.com.guilherme.escola.academico.dominio.aluno.Telefone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AlunoTest {
    
    @Test
    void naoDeveriaAdicionarTelefoneQuandoJaTemDoisCadastrados() {
        Aluno aluno = new Aluno(new Cpf("123.456.789-00"), "Teste", new Email("teste@email.com"));
        aluno.adicionarTelefone("21", "999885544");
        aluno.adicionarTelefone("32", "777885544");

        Assertions.assertThrows(IllegalArgumentException.class, () -> aluno.adicionarTelefone("18", "665885544"));
    }

    @Test
    void deveriaAdicionarTelefone() {
        Aluno aluno = new Aluno(new Cpf("123.456.789-00"), "Teste", new Email("teste@email.com"));
        aluno.adicionarTelefone("21", "999885544");
        aluno.adicionarTelefone("32", "777885544");

        List<Telefone> listaTelefones = new ArrayList<>();
        listaTelefones.add(new Telefone("21", "999885544"));
        listaTelefones.add(new Telefone("32", "777885544"));

        Assertions.assertEquals(listaTelefones.get(0).getNumero(), aluno.getTelefones().get(0).getNumero());
        Assertions.assertEquals(listaTelefones.get(0).getDdd(), aluno.getTelefones().get(0).getDdd());
        Assertions.assertEquals(listaTelefones.get(1).getNumero(), aluno.getTelefones().get(1).getNumero());
        Assertions.assertEquals(listaTelefones.get(1).getDdd(), aluno.getTelefones().get(1).getDdd());

    }
}
