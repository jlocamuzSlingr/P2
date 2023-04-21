package tp1.ej4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Triangulo(3, 4, 5));
        figuras.add(new Rectangulo(2, 6));
        figuras.add(new Circulo(7));
        figuras.add(new Triangulo(6, 8, 10));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
    }
}
