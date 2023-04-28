package ej2;

import java.util.List;

public class Hilo extends Thread {
    private List<Integer> listaValores;
    private String nombre;

    public Hilo(String nombre, List<Integer> listaValores) {
        this.nombre = nombre;
        this.listaValores = listaValores;
    }

    public void run() {
        System.out.println("Hilo " + nombre + " procesando la lista.");
        int n = 0;
        while (n < listaValores.size()) {
            int valor = listaValores.remove(n);
            int resultado = calcularFactorial(valor);
            System.out.println("Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + listaValores.size() + " elementos en la lista por procesar.");
            try {
                Thread.sleep(5000); // Espera 5 segundos antes de tomar el siguiente valor de la lista
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
