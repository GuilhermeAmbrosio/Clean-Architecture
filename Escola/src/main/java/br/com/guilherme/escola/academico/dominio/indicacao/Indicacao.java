package br.com.guilherme.escola.academico.dominio.indicacao;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;

import java.time.Instant;

public class Indicacao {
    private Aluno indicado;
    private Aluno indicante;
    private Instant dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        dataIndicacao = Instant.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Instant getDataIndicacao() {
        return dataIndicacao;
    }
}
