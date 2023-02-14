package clase001;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Persona {
    static final int EDAD_ADULTO = 18;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate edad;
    public Persona() {

    }

    public Persona(String nombre, String apellido, String email, LocalDate edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getfullName(){
        return this.getApellido() + ", " + this.getNombre();
    }

    public boolean esMayor(){
        return YEARS.between(this.edad,LocalDate.now() ) >= EDAD_ADULTO;
    }
}
