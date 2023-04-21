package tp1.ej4;
public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularSuperficie() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo de base " + base + " y altura " + altura;
    }
}
