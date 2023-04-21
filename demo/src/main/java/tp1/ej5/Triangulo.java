package tp1.ej5;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double ubicacionX;
    private double ubicacionY;

    public Triangulo(double lado1, double lado2, double lado3, double ubicacionX, double ubicacionY)
            throws ValorNegativoException, FiguraGeometricaException {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new FiguraGeometricaException("No se puede crear un triángulo con esos valores");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularSuperficie() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double getUbicacionX() {
        return ubicacionX;
    }

    @Override
    public double getUbicacionY() {
        return ubicacionY;
    }

    @Override
    public void setUbicacionX(double x) throws ValorNegativoException {
        if (x < 0) {
            throw new ValorNegativoException("La ubicación en X no puede ser negativa");
        }
        this.ubicacionX = x;
    }

    @Override
    public void setUbicacionY(double y) throws ValorNegativoException {
        if (y < 0) {
            throw new ValorNegativoException("La ubicación en Y no puede ser negativa");
        }
        this.ubicacionY = y;
    }

    @Override
    public String toString() {
        return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", ubicacionX=" + ubicacionX
                + ", ubicacionY=" + ubicacionY + "]";
    }
}
