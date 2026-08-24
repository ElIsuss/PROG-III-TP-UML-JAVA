package Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String codigoEstacion;
    private String nombre;
    private String personasContacto;
    private String direccion;
    private String telefono;
    private double kmEsquiables;
    private int cantidadPistas;
    private List<Pista> pistas;
    private List<Federacion> federaciones;

    public Estacion(String codigoEstacion, String nombre, String personasContacto,
                    String direccion, String telefono, double kmEsquiables, int cantidadPistas) {
        this.codigoEstacion = codigoEstacion;
        this.nombre = nombre;
        this.personasContacto = personasContacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kmEsquiables = kmEsquiables;
        this.cantidadPistas = cantidadPistas;
        this.pistas = new ArrayList<>();
        this.federaciones = new ArrayList<>();
    }

    public void agregarPista(Pista pista) {
        pistas.add(pista);
    }

    public void agregarFederacion(Federacion federacion) {
        if (!federaciones.contains(federacion)) {
            federaciones.add(federacion);
            federacion.agregarEstacion(this);
        }
    }

    // Getters y setters
    public String getCodigoEstacion() { return codigoEstacion; }
    public void setCodigoEstacion(String codigoEstacion) { this.codigoEstacion = codigoEstacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPersonasContacto() { return personasContacto; }
    public void setPersonasContacto(String personasContacto) { this.personasContacto = personasContacto; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public double getKmEsquiables() { return kmEsquiables; }
    public void setKmEsquiables(double kmEsquiables) { this.kmEsquiables = kmEsquiables; }

    public int getCantidadPistas() { return cantidadPistas; }
    public void setCantidadPistas(int cantidadPistas) { this.cantidadPistas = cantidadPistas; }

    public List<Pista> getPistas() { return pistas; }
    public List<Federacion> getFederaciones() { return federaciones; }

    @Override
    public String toString() {
        return "Estacion{codigo='" + codigoEstacion + "', nombre='" + nombre + "'}";
    }
}
