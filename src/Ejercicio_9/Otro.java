package Ejercicio_9;

/**
 * Categoría genérica para objetos de arte que no son Pintura ni Escultura
 * (fotografías, instalaciones, grabados, etc.).
 */
public class Otro extends ObjetoDeArte {
    private String categoria; // descripción libre del tipo de obra

    public Otro(String nroIdentificacion, String titulo, String descripcion,
                int anioCreacion, Artista artista, RegimenPatrimonial regimen,
                String categoria) {
        super(nroIdentificacion, titulo, descripcion, anioCreacion, artista, regimen);
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "Otro{id='" + getNroIdentificacion() + "', titulo='" + getTitulo() +
               "', categoria='" + categoria + "', anio=" + getAnioCreacion() + "}";
    }
}
