package br.com.guilherme.escola.academico.aplicacao.indicacao;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
