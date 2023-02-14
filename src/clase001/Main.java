package clase001;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBAS CLASE PERSONA");

        Persona persona1 = new Persona("Jose", "Perez","qweqw@email.com", LocalDate.of(2013,04,02));
        Persona persona2 = new Persona("Juan", "Martinez","martinez@email.com",LocalDate.of(2000,01,02));

        System.out.println(persona1.getfullName());

        System.out.println(persona1.getEdad());

        LocalDate fechaHoy = LocalDate.now();

        System.out.println(fechaHoy );

        System.out.println(YEARS.between(persona1.getEdad(),fechaHoy ));
        System.out.println(YEARS.between(persona2.getEdad(),fechaHoy ));

        System.out.println(persona1.esMayo());
        System.out.println(persona2.esMayo());
    }
}