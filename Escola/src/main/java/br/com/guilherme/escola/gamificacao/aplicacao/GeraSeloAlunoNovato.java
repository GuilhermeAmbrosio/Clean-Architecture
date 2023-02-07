package br.com.guilherme.escola.gamificacao.aplicacao;

import br.com.guilherme.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.guilherme.escola.gamificacao.dominio.selo.Selo;
import br.com.guilherme.escola.shared.dominio.Cpf;
import br.com.guilherme.escola.shared.dominio.evento.Evento;
import br.com.guilherme.escola.shared.dominio.evento.Ouvinte;
import br.com.guilherme.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorio;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    protected void reageAo(Evento evento) {
        Cpf cpfDoAluno = (Cpf) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "novato");
        repositorio.criarSelo(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
