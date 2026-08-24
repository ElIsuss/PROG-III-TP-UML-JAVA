package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona {
    private String nroLicencia;
    private String restricciones;
    // Relación muchos a muchos con TipoAvion (autorizaciones de vuelo)
    private List<TipoAvion> tiposAutorizados;

    public Piloto(String nroSeguridadSocial, String nombre, String direccion,
                  String telefono, String nroLicencia, String restricciones) {
        super(nroSeguridadSocial, nombre, direccion, telefono);
        this.nroLicencia = nroLicencia;
        this.restricciones = restricciones;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void autorizarTipoAvion(TipoAvion tipo) {
        if (!tiposAutorizados.contains(tipo)) {
            tiposAutorizados.add(tipo);
            tipo.agregarPiloto(this);
        }
    }

    public String getNroLicencia() { return nroLicencia; }
    public void setNroLicencia(String nroLicencia) { this.nroLicencia = nroLicencia; }

    public String getRestricciones() { return restricciones; }
    public void setRestricciones(String restricciones) { this.restricciones = restricciones; }

    public List<TipoAvion> getTiposAutorizados() { return tiposAutorizados; }

    @Override
    public String toString() {
        return "Piloto{nombre='" + getNombre() + "', licencia='" + nroLicencia +
               "', restricciones='" + restricciones + "'}";
    }
}
