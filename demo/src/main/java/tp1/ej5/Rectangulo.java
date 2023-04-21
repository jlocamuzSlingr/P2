package tp1.ej5;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double ubicacionX;
    private double ubicacionY;

    public Rectangulo(double base, double altura, double ubicacionX, double ubicacionY)
            throws ValorNegativoException {
        if (base < 0 || altura < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        this.base = base;
        this.altura = altura;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularSuperficie() {
        return base * altura;
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
        return "Rectangulo [base=" + base + ", altura=" + altura + ", ubicacionX=" + ubicacionX + ", ubicacionY="
                + ubicacionY + "]";
    }
}
