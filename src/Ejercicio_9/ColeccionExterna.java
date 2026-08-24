package Ejercicio_9;

import java.util.ArrayList;
import java.util.List;

public class ColeccionExterna {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;
    // Una colección externa puede tener n obras en préstamo en el museo
    private List<EnPrestamo> obrasEnPrestamo;

    public ColeccionExterna(String nombre, String tipo, String descripcion,
                            String direccion, String telefono, String personaContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
        this.obrasEnPrestamo = new ArrayList<>();
    }

    public void agregarObraEnPrestamo(EnPrestamo obra) {
        if (!obrasEnPrestamo.contains(obra)) {
            obrasEnPrestamo.add(obra);
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getPersonaContacto() { return personaContacto; }
    public void setPersonaContacto(String personaContacto) { this.personaContacto = personaContacto; }

    public List<EnPrestamo> getObrasEnPrestamo() { return obrasEnPrestamo; }

    @Override
    public String toString() {
        return "ColeccionExterna{nombre='" + nombre + "', tipo='" + tipo +
               "', contacto='" + personaContacto + "'}";
    }
}
