package Ejercicio_7;

import java.time.LocalDate;

public class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private Federacion federacion;

    public Esquiador(String idParticipante, String dni, String nombre, String apellido,
                     int edad, LocalDate fechaNacimiento, Federacion federacion) {
        super(idParticipante);
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        // Todo esquiador debe pertenecer a una federación (no se admiten no federados)
        this.federacion = federacion;
        federacion.agregarEsquiador(this);
    }

    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Federacion getFederacion() { return federacion; }
    public void setFederacion(Federacion federacion) { this.federacion = federacion; }

    @Override
    public String toString() {
        return "Esquiador{dni='" + dni + "', nombre='" + nombre + " " + apellido +
               "', federacion='" + federacion.getNombre() + "'}";
    }
}
