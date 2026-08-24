package Ejercicio_9;

public class Pintura extends ObjetoDeArte {
    private String tipoPintura; // óleo, acuarela, fresco, etc.
    private String soporte;     // lienzo, tabla, papel, etc.
    private String estilo;

    public Pintura(String nroIdentificacion, String titulo, String descripcion,
                   int anioCreacion, Artista artista, RegimenPatrimonial regimen,
                   String tipoPintura, String soporte, String estilo) {
        super(nroIdentificacion, titulo, descripcion, anioCreacion, artista, regimen);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    public String getTipoPintura() { return tipoPintura; }
    public void setTipoPintura(String tipoPintura) { this.tipoPintura = tipoPintura; }

    public String getSoporte() { return soporte; }
    public void setSoporte(String soporte) { this.soporte = soporte; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }

    @Override
    public String toString() {
        return "Pintura{id='" + getNroIdentificacion() + "', titulo='" + getTitulo() +
               "', tipo='" + tipoPintura + "', soporte='" + soporte +
               "', estilo='" + estilo + "', anio=" + getAnioCreacion() + "}";
    }
}
