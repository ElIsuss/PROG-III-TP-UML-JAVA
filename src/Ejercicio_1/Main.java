package Ejercicio_1;

public class Main {

    public static void main(String[] args) {

        // Crear puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(10, 0);
        Punto p3 = new Punto(10, 10);
        Punto p4 = new Punto(0, 10);

        // Crear lados
        Lado lado1 = new Lado(p1, p2);
        Lado lado2 = new Lado(p2, p3);
        Lado lado3 = new Lado(p3, p4);
        Lado lado4 = new Lado(p4, p1);

        // Crear cuadrado
        Cuadrado cuadrado = new Cuadrado();

        cuadrado.agregarLado(lado1);
        cuadrado.agregarLado(lado2);
        cuadrado.agregarLado(lado3);
        cuadrado.agregarLado(lado4);

        // Crear un círculo
        Circulo circulo = new Circulo(5);

        // Crear un triángulo
        Triangulo triangulo = new Triangulo();

        // Crear una figura compuesta
        Figura figuraCompuesta = new Figura() {};

        figuraCompuesta.agregarFigura(cuadrado);
        figuraCompuesta.agregarFigura(circulo);
        figuraCompuesta.agregarFigura(triangulo);

        System.out.println("Lados del cuadrado: "
                + cuadrado.getLados().size());

        System.out.println("Lados del triángulo: "
                + triangulo.getNumeroLados());

        System.out.println("Figuras componentes: "
                + figuraCompuesta.getFiguras().size());
    }
}