package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }
    
    public void generarInforme() {
        System.out.println("___ INFORME DE DÉFICIT ___");
        System.out.println("País: " + nombre);
        System.out.println();
        
        for (Provincia p : provincias) {
            System.out.println("Provincia: " + p.getNombre());
            List<Ciudad> deficitCiudades = p.getCiudadesEnDeficit();
            if (deficitCiudades.isEmpty()) {
                System.out.println("  No hay ciudades elegibles en deficit.");
            } else {
                System.out.println("  Ciudades en déficit (población > 100.000):");
                for (Ciudad c : deficitCiudades) {
                    System.out.printf("    - %s (poblacion: %d, recaudado: %.2f, gastos: %.2f)%n",
                            c.getNombre(), c.getPoblacion(),
                            c.getTotalRecaudado(), c.getGastosMantenimiento());
                }
            }
            
            if (p.tieneMayoriaEnDeficit()) {
                System.out.println("  *** Esta provincia tiene MAYORiA de ciudades en deficit ***");
            } else {
                System.out.println("  Esta provincia NO tiene mayoría de ciudades en deficit.");
            }
            System.out.println();
        }
        
        System.out.println("--- Provincias con mayoría en deficit ---");
        List<Provincia> conMayoria = getProvinciasConMayoriaDeficit();
        if (conMayoria.isEmpty()) {
            System.out.println("Ninguna provincia cumple la condicion.");
        } else {
            for (Provincia p : conMayoria) {
                System.out.println(" - " + p.getNombre());
            }
        }
    }
    
    public List<Provincia> getProvinciasConMayoriaDeficit() {
        List<Provincia> resultado = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.tieneMayoriaEnDeficit()) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}