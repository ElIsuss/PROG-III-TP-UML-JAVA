package Ejercicio_3;

import java.util.List;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private List<Double> impuestos;
    private double gastosMantenimiento;

    public Ciudad(String nombre, int poblacion, List<Double> impuestos, double gastosMantenimiento) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.impuestos = impuestos;
        this.gastosMantenimiento = gastosMantenimiento;
    }

    public double getTotalRecaudado() {
        double total = 0.0;
        for (Double imp : impuestos) {
            total += imp;
        }
        return total;
    }

    public boolean isEnDeficit() {
        return getTotalRecaudado() < gastosMantenimiento;
    }

    public boolean isElegible() {
        return poblacion > 100_000;
    }

    
    public String getNombre() {
        return nombre; 
    }
    public int getPoblacion() {
        return poblacion; 
    }
    public List<Double> getImpuestos() {
        return impuestos; 
    }
    public double getGastosMantenimiento() { 
        return gastosMantenimiento; 
    }
}