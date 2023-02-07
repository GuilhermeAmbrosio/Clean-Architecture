package br.com.guilherme.escola.academico.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(Cpf cpf) {
        super("Aluno com cpf: " + cpf.getNumero() + " não foi encontrado!");
    }
}
