package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ---------- Crear minerales ----------
        Mineral nitrogeno = new Mineral("Nitrogeno", TipoMineral.PRIMARIO);
        Mineral fosforo = new Mineral("Fosforo", TipoMineral.PRIMARIO);
        Mineral potasio = new Mineral("Potasio", TipoMineral.PRIMARIO);
        Mineral calcio = new Mineral("Calcio", TipoMineral.SECUNDARIO);
        Mineral magnesio = new Mineral("Magnesio", TipoMineral.SECUNDARIO);
        
        // ---------- Crear cereales ----------
        Cereal maiz = new Cereal("Maiz", TipoCereal.GRUESO);
        maiz.agregarMineralRequerido(nitrogeno);
        maiz.agregarMineralRequerido(fosforo);
        maiz.agregarMineralRequerido(potasio);

        
        Cereal trigo = new Cereal("Trigo", TipoCereal.FINO);
        trigo.agregarMineralRequerido(nitrogeno);
        trigo.agregarMineralRequerido(fosforo);
        trigo.agregarMineralRequerido(calcio);

        
        Cereal alfalfa = new Cereal("Alfalfa", TipoCereal.PASTURA);
        alfalfa.agregarMineralRequerido(fosforo);
        alfalfa.agregarMineralRequerido(calcio);
        alfalfa.agregarMineralRequerido(magnesio);

        
        List<Cereal> catalogo = new ArrayList<>();
        catalogo.add(maiz);
        catalogo.add(trigo);
        catalogo.add(alfalfa);

        // ---------- Crear lotes ----------
        
        Lote lote1 = new Lote("A");
        lote1.agregarMineral(nitrogeno);
        lote1.agregarMineral(fosforo);
        lote1.agregarMineral(potasio);
        lote1.agregarMineral(calcio);
        
        Lote lote2 = new Lote("B");
        lote2.agregarMineral(fosforo);
        lote2.agregarMineral(calcio);
        lote2.agregarMineral(magnesio);
        lote2.setPasturaSembradaPreviamente(true);
        
        Lote lote3 = new Lote("C");
        lote3.agregarMineral(nitrogeno);
        lote3.agregarMineral(fosforo);
        lote3.agregarMineral(potasio);

        // ---------- Mostrar recomendaciones ----------
        System.out.println("RECOMENDACIONES DE SIEMBRA\n");

        mostrarRecomendaciones(lote1, catalogo);
        mostrarRecomendaciones(lote2, catalogo);
        mostrarRecomendaciones(lote3, catalogo);
    }

    private static void mostrarRecomendaciones(Lote lote, List<Cereal> catalogo) {
        System.out.println("Lote: " + lote.getNombre());
        System.out.println("    Minerales: " + lote.getMinerales());
        System.out.println("    Pastura sembrada previamente? " + lote.isPasturaSembradaPreviamente());

        List<Cereal> aptos = lote.recomendarCereales(catalogo);
        if (aptos.isEmpty()) {
            System.out.println("    -Ningún cereal apto para este lote.");
        } else {
            System.out.println("    -Cereales aptos: " + aptos);
        }
        System.out.println();
    }
}