package Ejercicio_9;

import java.time.LocalDate;

/**
 * Régimen patrimonial: la obra es cedida temporalmente por una colección externa.
 */
public class EnPrestamo implements RegimenPatrimonial {
    private String nombreColeccion;
    private LocalDate fechaRecibido;
    private LocalDate fechaDevolucion;
    private ColeccionExterna coleccionExterna;

    public EnPrestamo(String nombreColeccion, LocalDate fechaRecibido,
                      LocalDate fechaDevolucion, ColeccionExterna coleccionExterna) {
        this.nombreColeccion = nombreColeccion;
        this.fechaRecibido = fechaRecibido;
        this.fechaDevolucion = fechaDevolucion;
        this.coleccionExterna = coleccionExterna;
        coleccionExterna.agregarObraEnPrestamo(this);
    }

    @Override
    public String getTipoRegimen() { return "En Préstamo"; }

    @Override
    public String getResumenRegimen() {
        return "Colección: " + nombreColeccion + " | Recibido: " + fechaRecibido +
               " | Devolucion: " + fechaDevolucion;
    }

    public String getNombreColeccion() { return nombreColeccion; }
    public void setNombreColeccion(String nombreColeccion) { this.nombreColeccion = nombreColeccion; }

    public LocalDate getFechaRecibido() { return fechaRecibido; }
    public void setFechaRecibido(LocalDate fechaRecibido) { this.fechaRecibido = fechaRecibido; }

    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public ColeccionExterna getColeccionExterna() { return coleccionExterna; }

    @Override
    public String toString() {
        return "EnPrestamo{coleccion='" + nombreColeccion + "', recibido=" + fechaRecibido +
               ", devolucion=" + fechaDevolucion + "}";
    }
}
