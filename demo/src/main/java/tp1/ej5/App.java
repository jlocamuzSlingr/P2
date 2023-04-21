package tp1.ej5;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws FiguraGeometricaException {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        try {
            figuras.add(new Circulo(5, 3, 4));
            figuras.add(new Rectangulo(8, 3, 5, 7));
            figuras.add(new Triangulo(6, 4, 8,2,1));
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
    }
}

