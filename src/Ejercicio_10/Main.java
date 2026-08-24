package Ejercicio_10;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ----- SedeOlimpica -----
        SedeOlimpica sede = new SedeOlimpica(2, 5000000);

        // ----- ComplejoDeportivo (subclases UniDeportivo y PoliDeportivo) -----
        UniDeportivo uniDeportivo = new UniDeportivo("Parque Central", "Natacion");
        PoliDeportivo poliDeportivo = new PoliDeportivo("Ciudad Deportiva", "Futbol, Basquet, Tenis");

        sede.agregarComplejo(uniDeportivo);
        sede.agregarComplejo(poliDeportivo);

        // ----- JefeOrganizacion (1 a 1 con ComplejoDeportivo) -----
        JefeOrganizacion jefeUni = new JefeOrganizacion("Maria Lopez", uniDeportivo);
        uniDeportivo.setJefeOrganizacion(jefeUni);

        // ----- Comisario fijo del complejo (1 a 1) -----
        Comisario comisarioFijo = new Comisario("Carlos Perez");
        uniDeportivo.setComisario(comisarioFijo);

        // ----- AreaDeportiva (1..n por complejo) -----
        AreaDeportiva area1 = new AreaDeportiva("Natacion", "Centro", uniDeportivo);
        uniDeportivo.agregarArea(area1);

        // ----- Evento (1..n por complejo) -----
        Evento evento1 = new Evento(LocalDate.of(2026, 9, 15), 120, 300, 2, uniDeportivo);
        uniDeportivo.agregarEvento(evento1);

        // ----- Comisario asignado a Evento (1..n a 1..n) -----
        Comisario comisarioEvento = new Comisario("Ana Torres");
        comisarioEvento.asignarEvento(evento1);
        comisarioFijo.asignarEvento(evento1);

        // ----- Material (1..n por Evento) -----
        Material material1 = new Material("Cronometro", 5, evento1);
        evento1.agregarMaterial(material1);

        // ----- Prints para testear -----
        System.out.println(sede);
        System.out.println(uniDeportivo);
        System.out.println(poliDeportivo);
        System.out.println(jefeUni);
        System.out.println(comisarioFijo);
        System.out.println(area1);
        System.out.println(evento1);
        System.out.println(comisarioEvento);
        System.out.println(material1);
    }
}