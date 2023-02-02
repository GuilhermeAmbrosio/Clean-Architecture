package br.com.guilherme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelefoneTest {

    @Test
    void naoDeveriaCadastrarNumeroDeTelefoneComDadosInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("17", "1515151"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("17", null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("17", "1515551514"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("417", "151555125"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "151555151"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "151555151"));
    }

    @Test
    void deveriaCadastrarNumeroDeTelefoneComDadosValidos() {
        var telefone = new Telefone("21", "115458595");
        Assertions.assertNotNull(telefone);
        Assertions.assertEquals(telefone.getNumero(), "115458595");
        Assertions.assertEquals(telefone.getDdd(), "21");
    }
}
