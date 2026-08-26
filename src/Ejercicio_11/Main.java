package Ejercicio_11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Crear empresa con 10% de comisión
        Empresa empresa = new Empresa(0.10);

        //Crear productos
        Producto prodA = new Producto("Producto A", 1000);
        Producto prodB = new Producto("Producto B", 500);
        Producto prodC = new Producto("Producto C", 200);
        empresa.agregarProducto(prodA);
        empresa.agregarProducto(prodB);
        empresa.agregarProducto(prodC);

        //Crear clientes (solo para concretar ventas)
        Cliente cl1 = new Cliente("Cliente1", "Direccion1", "542611818", LocalDate.of(1990, 1, 1), LocalDate.of(2024, 1, 1));
        Cliente cl2 = new Cliente("Cliente2", "Direccion2", "542610909", LocalDate.of(1995, 2, 2), LocalDate.of(2024, 2, 1));

        //Crear vendedores y líder
        Vendedor vendedor1 = new Vendedor(
            "Juan Vendedor",
            "Calle A 111",
            "555-1111",
            LocalDate.of(1990, 1, 1),
            "20-11111111-1",
            LocalDate.of(2024, 1, 1)
        );
        Vendedor vendedor2 = new Vendedor(
            "Pepe Vendedor",
            "Calle B 222",
            "555-2222",
            LocalDate.of(1992, 2, 2),
            "20-22222222-2",
            LocalDate.of(2024, 1, 1)
        );
        Lider lider1 = new Lider(
            "Martin Lider",
            "Calle C 333",
            "555-3333",
            LocalDate.of(1985, 3, 3),
            "20-33333333-3",
            LocalDate.of(2020, 1, 1),
            LocalDate.of(2023, 1, 1)
        );

        //Armar equipo
        lider1.agregarVendedor(vendedor1);
        lider1.agregarVendedor(vendedor2);

        //Registrar representantes en la empresa
        empresa.agregarRepresentante(vendedor1);
        empresa.agregarRepresentante(vendedor2);
        empresa.agregarRepresentante(lider1);

        //Agregar clientes a las carteras
        vendedor1.agregarCliente(cl1);
        vendedor2.agregarCliente(cl2);
        lider1.agregarCliente(cl1);

        //Emitir tickets (compras de los representantes) con fechas dentro del período
        Ticket t1 = empresa.emitirTicket(vendedor1, prodA, LocalDate.of(2025, 1, 10));
        Ticket t2 = empresa.emitirTicket(vendedor1, prodB, LocalDate.of(2025, 1, 15));
        Ticket t3 = empresa.emitirTicket(vendedor2, prodC, LocalDate.of(2025, 1, 20));
        Ticket t4 = empresa.emitirTicket(lider1, prodA, LocalDate.of(2025, 1, 5));

        //Concretar ventas
        vendedor1.registrarVenta(t1, cl1);
        vendedor1.registrarVenta(t2, cl2);
        vendedor2.registrarVenta(t3, cl1);
        lider1.registrarVenta(t4, cl2);

        //Realizar reunión el 1 de febrero
        LocalDate reunionActual = LocalDate.of(2025, 2, 1);
        LocalDate proximaReunion = LocalDate.of(2025, 3, 1);
        empresa.realizarReunion(reunionActual, proximaReunion);

        System.out.println("\nProxima reunion: " + empresa.getFechaProximaReunion());
    }
}