package Ejercicio_6;

public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    private String numSeguroSocial;

    // Constructor
    public Personal(String dni, String nombre, String direccion, String telefono,
                    double sueldo, String numSeguroSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.numSeguroSocial = numSeguroSocial;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(String numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }
}
