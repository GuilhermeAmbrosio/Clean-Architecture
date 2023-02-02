package br.com.guilherme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("email"));
    }

    @Test
    void deveriaCriarUmEmailComEnderecosValidos() {
        var endereco = "guilherme.ambrosio@gmail.com";
        var email = new Email(endereco);

        Assertions.assertNotNull(email);
        Assertions.assertEquals(email.getEndereco(), endereco);
    }
}
