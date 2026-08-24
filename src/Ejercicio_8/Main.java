package Ejercicio_8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // --- Tipos de avión ---
        TipoAvion cessna172 = new TipoAvion("Cessna-172", 4, 1111.0);
        TipoAvion boeing737 = new TipoAvion("Boeing-737", 189, 79016.0);

        // --- Hangares ---
        Hangar hangar1 = new Hangar(1, 5, "Sector Norte");
        Hangar hangar2 = new Hangar(2, 3, "Sector Sur");

        // --- Aviones ---
        Avion avion1 = new Avion("EC-ABC", LocalDate.of(2018, 6, 15), cessna172, hangar1);
        Avion avion2 = new Avion("EC-DEF", LocalDate.of(2020, 3, 22), cessna172, hangar1);
        Avion avion3 = new Avion("EC-GHI", LocalDate.of(2015, 11, 5), boeing737, hangar2);

        // --- Propietarios (muchos a muchos con Avion) ---
        Propietario prop1 = new Propietario("SS-001", "Luis Fernández",
                "Calle Mayor 10, Madrid", "600-111-222");
        Propietario prop2 = new Propietario("SS-002", "Carmen Vega",
                "Av. Diagonal 45, Barcelona", "600-333-444");

        prop1.agregarAvion(avion1);
        prop1.agregarAvion(avion2); // Luis tiene dos aviones
        prop2.agregarAvion(avion2); // avion2 tiene dos propietarios
        prop2.agregarAvion(avion3);

        // --- Pilotos (muchos a muchos con TipoAvion) ---
        Piloto piloto1 = new Piloto("SS-101", "Marcos Díaz",
                "Paseo del Prado 3, Madrid", "611-000-001",
                "LIC-2021-001", "Solo vuelo diurno");
        Piloto piloto2 = new Piloto("SS-102", "Sara López",
                "Gran Vía 20, Madrid", "611-000-002",
                "LIC-2019-045", "Ninguna");

        piloto1.autorizarTipoAvion(cessna172);          // Marcos vuela Cessna
        piloto2.autorizarTipoAvion(cessna172);          // Sara vuela Cessna
        piloto2.autorizarTipoAvion(boeing737);          // Sara también vuela Boeing

        // --- Mecánicos (muchos a muchos con TipoAvion) ---
        Mecanico mec1 = new Mecanico("SS-201", "Roberto Gil",
                "Calle Luna 5, Sevilla", "622-000-001", 2500.0, "Mañana");
        Mecanico mec2 = new Mecanico("SS-202", "Elena Ramos",
                "Calle Sol 8, Sevilla", "622-000-002", 2800.0, "Tarde");

        mec1.autorizarTipoAvion(cessna172);
        mec2.autorizarTipoAvion(cessna172);
        mec2.autorizarTipoAvion(boeing737);

        // --- Servicios (clase asociativa Mecanico <-> Avion) ---
        Servicios s1 = new Servicios(LocalDate.of(2026, 1, 10), 3,
                "Revisión de motor", mec1, avion1);
        Servicios s2 = new Servicios(LocalDate.of(2026, 2, 5), 5,
                "Cambio de aceite", mec2, avion1);
        Servicios s3 = new Servicios(LocalDate.of(2026, 3, 18), 8,
                "Inspección general", mec2, avion3);

        // =============================================
        // SALIDA EN CONSOLA
        // =============================================

        System.out.println("====================================================");
        System.out.println("              AERÓDROMO - SISTEMA DE GESTIÓN");
        System.out.println("====================================================\n");

        // Tipos de avión
        System.out.println("--- TIPOS DE AVIÓN ---");
        System.out.println(cessna172);
        System.out.println("  Pilotos autorizados:");
        for (Piloto p : cessna172.getPilotos())
            System.out.println("    · " + p.getNombre() + " (Lic: " + p.getNroLicencia() + ")");
        System.out.println("  Mecánicos autorizados:");
        for (Mecanico m : cessna172.getMecanicos())
            System.out.println("    · " + m.getNombre() + " (Turno: " + m.getTurno() + ")");
        System.out.println();
        System.out.println(boeing737);
        System.out.println("  Pilotos autorizados:");
        for (Piloto p : boeing737.getPilotos())
            System.out.println("    · " + p.getNombre() + " (Lic: " + p.getNroLicencia() + ")");
        System.out.println("  Mecánicos autorizados:");
        for (Mecanico m : boeing737.getMecanicos())
            System.out.println("    · " + m.getNombre() + " (Turno: " + m.getTurno() + ")");

        // Hangares
        System.out.println("\n--- HANGARES ---");
        for (Hangar h : new Hangar[]{hangar1, hangar2}) {
            System.out.println(h);
            for (Avion a : h.getAviones())
                System.out.println("  · " + a);
        }

        // Aviones y sus propietarios
        System.out.println("\n--- AVIONES Y PROPIETARIOS ---");
        for (Avion a : new Avion[]{avion1, avion2, avion3}) {
            System.out.println(a + "  |  Adquirido: " + a.getFechaAdquisicion());
            System.out.println("  Propietarios:");
            for (Propietario p : a.getPropietarios())
                System.out.println("    · " + p.getNombre());
        }

        // Pilotos
        System.out.println("\n--- PILOTOS ---");
        for (Piloto p : new Piloto[]{piloto1, piloto2}) {
            System.out.println(p);
            System.out.println("  Tipos autorizados:");
            for (TipoAvion t : p.getTiposAutorizados())
                System.out.println("    · " + t.getNroModelo());
        }

        // Mecánicos
        System.out.println("\n--- MECÁNICOS ---");
        for (Mecanico m : new Mecanico[]{mec1, mec2}) {
            System.out.println(m);
            System.out.println("  Tipos que mantiene:");
            for (TipoAvion t : m.getTiposAutorizados())
                System.out.println("    · " + t.getNroModelo());
        }

        // Servicios realizados
        System.out.println("\n--- SERVICIOS REALIZADOS ---");
        for (Servicios s : new Servicios[]{s1, s2, s3}) {
            System.out.println(s);
        }

        // Historial de servicios por avión
        System.out.println("\n--- HISTORIAL DE SERVICIOS POR AVIÓN ---");
        for (Avion a : new Avion[]{avion1, avion2, avion3}) {
            System.out.println("Avión " + a.getMatricula() + ":");
            if (a.getServicios().isEmpty()) {
                System.out.println("  Sin servicios registrados.");
            } else {
                for (Servicios s : a.getServicios())
                    System.out.println("  · " + s.getFecha() + " | " + s.getTipoTrabajo() +
                                       " | " + s.getHorasInvertidas() + "h | Mec: " + s.getMecanico().getNombre());
            }
        }

        // Propietarios y sus aviones
        System.out.println("\n--- PROPIETARIOS ---");
        for (Propietario p : new Propietario[]{prop1, prop2}) {
            System.out.println(p);
            for (Avion a : p.getAviones())
                System.out.println("  · " + a.getMatricula() + " (" + a.getTipoAvion().getNroModelo() + ")");
        }
    }
}
