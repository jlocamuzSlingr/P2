package tp1.ej5;

public interface FiguraGeometrica {
    double calcularPerimetro();
    double calcularSuperficie();
    double getUbicacionX();
    double getUbicacionY();
    void setUbicacionX(double x) throws ValorNegativoException;
    void setUbicacionY(double y) throws ValorNegativoException;
}
