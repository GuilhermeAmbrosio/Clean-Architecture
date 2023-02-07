package br.com.guilherme.escola.gamificacao.infraestrutura.selo;

import br.com.guilherme.escola.shared.dominio.Cpf;
import br.com.guilherme.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.guilherme.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    public List<Selo> listaDeSelos = new ArrayList<>();

    @Override
    public void criarSelo(Selo selo) {
        this.listaDeSelos.add(selo);
    }

    @Override
    public List<Selo> buscarSeloPorCpfDoAluno(Cpf cpf) {
        return this.listaDeSelos.stream()
                .filter(item -> item.getCpfDoAluno().getNumero().equals(cpf.getNumero()))
                .collect(Collectors.toList());
    }


}
