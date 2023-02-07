package br.com.guilherme.escola.academico.dominio.aluno;

import br.com.guilherme.escola.academico.dominio.indicacao.Indicacao;
import br.com.guilherme.escola.shared.dominio.Cpf;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Cpf cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;
    private Indicacao indicacao;

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String telefone) {
        if (this.telefones.size() < 2){
            this.telefones.add(new Telefone(ddd, telefone));
        } else {
            throw new IllegalArgumentException("Número máximo de telefones atingido!");
        }
    }

    public Cpf getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
