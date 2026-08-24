package Ejercicio_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta base para todos los objetos de arte del museo.
 * Contiene los atributos comunes y una referencia al régimen patrimonial
 * (Permanente o EnPrestamo), resolviendo la doble jerarquía del diagrama
 * mediante composición sobre la interfaz RegimenPatrimonial.
 */
public abstract class ObjetoDeArte {
    private String nroIdentificacion;
    private String titulo;
    private String descripcion;
    private int anioCreacion;
    private Artista artista;
    private RegimenPatrimonial regimen;
    private List<Exposicion> exposiciones;

    public ObjetoDeArte(String nroIdentificacion, String titulo, String descripcion,
                        int anioCreacion, Artista artista, RegimenPatrimonial regimen) {
        this.nroIdentificacion = nroIdentificacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anioCreacion = anioCreacion;
        this.regimen = regimen;
        this.exposiciones = new ArrayList<>();
        // Registro bidireccional con el artista
        this.artista = artista;
        artista.agregarObra(this);
    }

    public void agregarExposicion(Exposicion exposicion) {
        if (!exposiciones.contains(exposicion)) {
            exposiciones.add(exposicion);
        }
    }

    // Getters y setters
    public String getNroIdentificacion() { return nroIdentificacion; }
    public void setNroIdentificacion(String nroIdentificacion) { this.nroIdentificacion = nroIdentificacion; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    public RegimenPatrimonial getRegimen() { return regimen; }
    public void setRegimen(RegimenPatrimonial regimen) { this.regimen = regimen; }

    public List<Exposicion> getExposiciones() { return exposiciones; }

    @Override
    public String toString() {
        return "ObjetoDeArte{id='" + nroIdentificacion + "', titulo='" + titulo +
               "', anio=" + anioCreacion + ", artista='" + artista.getNombre() + "'}";
    }
}
