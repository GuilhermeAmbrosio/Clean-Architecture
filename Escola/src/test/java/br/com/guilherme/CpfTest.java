package br.com.guilherme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CpfTest {

    @Test
    void naoDeveriaCadastrarComCpfInvalido() {
        Assertions.assertThrows( IllegalArgumentException.class, () -> new Cpf("151515"));
        Assertions.assertThrows( IllegalArgumentException.class, () -> new Cpf(null));
    }

    @Test
    void deveriaCadastrarComCpfValido() {

        var cpf = new Cpf("899.502.170-59");

        Assertions.assertNotNull(cpf);
        Assertions.assertEquals(cpf.getNumero(), "899.502.170-59");
    }
}
