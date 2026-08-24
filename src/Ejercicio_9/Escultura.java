package Ejercicio_9;

public class Escultura extends ObjetoDeArte {
    private String material; // mármol, bronce, madera, etc.
    private double altura;   // en metros
    private double peso;     // en kg
    private String estilo;

    public Escultura(String nroIdentificacion, String titulo, String descripcion,
                     int anioCreacion, Artista artista, RegimenPatrimonial regimen,
                     String material, double altura, double peso, String estilo) {
        super(nroIdentificacion, titulo, descripcion, anioCreacion, artista, regimen);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }

    @Override
    public String toString() {
        return "Escultura{id='" + getNroIdentificacion() + "', titulo='" + getTitulo() +
               "', material='" + material + "', altura=" + altura +
               "m, peso=" + peso + "kg, estilo='" + estilo + "'}";
    }
}
