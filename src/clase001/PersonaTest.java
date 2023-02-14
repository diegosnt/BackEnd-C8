package clase001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona persona1;
    Persona persona2;
    @BeforeEach
    void doBefore(){
        persona1 = new Persona("Jose", "Perez","qweqw@email.com", LocalDate.of(2013,01,02));
        persona2 = new Persona("Juan", "Martinez","martinez@email.com",LocalDate.of(2003,01,02));
    }
    @Test
    void traeNombre() {
        assertEquals("Perez, Jose", persona1.getfullName());
        assertEquals("Martinez, Juan", persona2.getfullName());
    }
    @Test
    void esAdulto() {
        assertEquals(false, persona1.esMayo());
        assertEquals(true, persona2.esMayo());
    }
}