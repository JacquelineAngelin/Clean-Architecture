package school.domain.studant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldNotAllowToInsertInvalidEmailAddress(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

//    @Test
//    void shouldAcceptValidEmail(){
//        String endereco = "alunoalurara@alura.com.br";
//        Email email = new Email(endereco);
//        assertEquals(endereco, email.getEndereco());
//    }
}