package Ejercicio_8;

public abstract class Persona {
    private String nroSeguridadSocial;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nroSeguridadSocial, String nombre, String direccion, String telefono) {
        this.nroSeguridadSocial = nroSeguridadSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNroSeguridadSocial() { return nroSeguridadSocial; }
    public void setNroSeguridadSocial(String nroSeguridadSocial) { this.nroSeguridadSocial = nroSeguridadSocial; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Persona{nroSS='" + nroSeguridadSocial + "', nombre='" + nombre + "'}";
    }
}
