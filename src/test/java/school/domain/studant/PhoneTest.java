package school.domain.studant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

//    String ddd = "11";
//    String numero = "123456789";

    @Test
    void shouldNotAcceptInvalidDddCode(){
        assertThrows(IllegalArgumentException.class, () -> new Phone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("1","123456789"));
    }

    @Test
    void shouldNotAcceptInvalidPhoneNumber(){
        assertThrows(IllegalArgumentException.class, () -> new Phone("11", null));
////        assertThrows(IllegalArgumentException.class, () -> new Phone("11", "Abril2022"));
//        assertThrows(IllegalArgumentException.class, () -> new Phone("11", "123"));
    }

    @Test
    void shouldAcceptValidDddAndPhoneNumber(){
        String ddd = "11";
        String numero = "123456789";
        Phone phone = new Phone(ddd, numero);
//        assertEquals(ddd, phone.getDdd());
        assertEquals(numero, phone.getNumero());
    }

}