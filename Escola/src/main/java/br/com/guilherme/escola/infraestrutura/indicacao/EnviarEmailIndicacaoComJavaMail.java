package br.com.guilherme.escola.infraestrutura.indicacao;

import br.com.guilherme.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.guilherme.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        //logica de envio de emails com a lib Java Mail
    }
}
