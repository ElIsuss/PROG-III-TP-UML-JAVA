package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Guarda extends Personal {
    // Un Guarda usa N Vehiculos (relación N:M con Vehiculo)
    private List<Vehiculo> vehiculos;

    // Constructor
    public Guarda(String dni, String nombre, String direccion, String telefono,
                  double sueldo, String numSeguroSocial) {
        super(dni, nombre, direccion, telefono, sueldo, numSeguroSocial);
        this.vehiculos = new ArrayList<>();
    }

    // Getters y Setters
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
}
