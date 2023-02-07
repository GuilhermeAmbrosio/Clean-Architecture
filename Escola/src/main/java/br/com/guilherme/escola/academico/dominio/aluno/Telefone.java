package br.com.guilherme.escola.academico.dominio.aluno;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null ) {
            throw new IllegalArgumentException("DDD inválido");
        } else if (ddd.length() > 2 || ddd.length() < 2) {
            throw new IllegalArgumentException("DDD inválido");
        }

        if (numero == null) {
            throw new IllegalArgumentException("Número inválido");
        } else if (numero.length() > 9 || numero.length() < 8) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
