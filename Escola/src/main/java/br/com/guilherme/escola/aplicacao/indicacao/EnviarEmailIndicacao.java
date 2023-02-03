package br.com.guilherme.escola.aplicacao.indicacao;

import br.com.guilherme.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
