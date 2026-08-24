package Ejercicio_5;

public class Main {

    public static void main(String[] args) {

        // ----- Ciudad -----
        Ciudad mendoza = new Ciudad("Mendoza");

        // ----- Restaurante (Ciudad tiene 1..n Restaurantes) -----
        Restaurante donJose = new Restaurante("Don Jose", mendoza);
        mendoza.agregarRestaurante(donJose);

        // ----- Sucursal (Restaurante tiene 1..n Sucursales) -----
        Sucursal sucursalCentro = new Sucursal("Centro", donJose);
        donJose.agregarSucursal(sucursalCentro);

        // ----- Plato (Restaurante tiene 1..n Platos) -----
        Plato milanesa = new Plato("Milanesa napolitana", donJose);
        donJose.agregarPlato(milanesa);

        // ----- Persona -----
        Persona juan = new Persona("Juan");

        // ----- Persona frecuenta Restaurante (1..n a 1..n) -----
        juan.frecuentar(donJose);

        // ----- Preferencia (une Persona, Restaurante y Plato) -----
        Preferencia preferenciaJuan = new Preferencia(juan, donJose, milanesa, true);
        juan.agregarPreferencia(preferenciaJuan);
        donJose.agregarPreferencia(preferenciaJuan);
        milanesa.agregarPreferencia(preferenciaJuan);

        // ----- Prints para testear -----
        System.out.println(mendoza);
        System.out.println(donJose);
        System.out.println(sucursalCentro);
        System.out.println(milanesa);
        System.out.println(juan);
        System.out.println(preferenciaJuan);
    }
}