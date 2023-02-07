package br.com.guilherme.escola.academico.dominio.aluno;


import br.com.guilherme.escola.shared.dominio.evento.Evento;
import br.com.guilherme.escola.shared.dominio.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

import static java.time.ZoneOffset.of;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {

        String format = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(
                String.format("Aluno com CPF %s, matriculado em: %s", ((AlunoMatriculado) evento).getCpfDoAluno().getNumero(), format));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}


