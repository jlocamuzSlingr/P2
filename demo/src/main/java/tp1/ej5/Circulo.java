package tp1.ej5;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double ubicacionX;
    private double ubicacionY;

    public Circulo(double radio, double ubicacionX, double ubicacionY) throws ValorNegativoException {
        if (radio < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        this.radio = radio;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
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
        return "Circulo [radio=" + radio + ", ubicacionX=" + ubicacionX + ", ubicacionY=" + ubicacionY + "]";
    }
}
