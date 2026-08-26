package Ejercicio_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("Argentina");
        
        Provincia p1 = new Provincia("Buenos Aires");
        Provincia p2 = new Provincia("Mendoza");

        Ciudad c1 = new Ciudad("La Plata", 800_000, Arrays.asList(100.0, 200.0, 50.0, 30.0, 20.0), 350.0);
        Ciudad c2 = new Ciudad("Mar del Plata", 120_000, Arrays.asList(80.0, 90.0, 40.0, 10.0, 5.0), 250.0);
        Ciudad c3 = new Ciudad("Bahía Blanca", 90_000, Arrays.asList(60.0, 70.0, 30.0, 20.0, 10.0), 180.0);
        Ciudad c4 = new Ciudad("Tandil", 150_000, Arrays.asList(50.0, 60.0, 20.0, 15.0, 5.0), 200.0);

        p1.agregarCiudad(c1);
        p1.agregarCiudad(c2);
        p1.agregarCiudad(c3);
        p1.agregarCiudad(c4);
        
        Ciudad c5 = new Ciudad("Las Heras", 1_500_000, Arrays.asList(200.0, 300.0, 100.0, 50.0, 30.0), 600.0);
        Ciudad c6 = new Ciudad("Godoy Cruz", 200_000, Arrays.asList(90.0, 80.0, 40.0, 20.0, 10.0), 250.0);
        Ciudad c7 = new Ciudad("Guaymallen", 80_000, Arrays.asList(40.0, 30.0, 15.0, 10.0, 5.0), 100.0);

        p2.agregarCiudad(c5);
        p2.agregarCiudad(c6);
        p2.agregarCiudad(c7);
        
        pais.agregarProvincia(p1);
        pais.agregarProvincia(p2);
        
        pais.generarInforme();
    }
}