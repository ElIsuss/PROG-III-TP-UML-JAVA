package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private String nombre;
    private Ciudad ciudad;
    private List<Sucursal> sucursales;
    private List<Plato> platos;
    private List<Persona> personas;
    private List<Preferencia> preferencias;

    public Restaurante(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.sucursales = new ArrayList<>();
        this.platos = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.preferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Preferencia> getPreferencias() {
        return preferencias;
    }

    public void agregarPreferencia(Preferencia preferencia) {
        preferencias.add(preferencia);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}