package br.com.guilherme.escola.academico.infraestrutura.indicacao;

import br.com.guilherme.escola.academico.dominio.aluno.Aluno;
import br.com.guilherme.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        //logica de envio de emails com a lib Java Mail
    }
}
