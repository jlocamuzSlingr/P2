package ej1;

import java.util.Random;

public class HiloA extends Thread {
    
    private String nombre;
    
    public HiloA(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            int iteracion = rand.nextInt(31) + 10;
            int delay = rand.nextInt(950) + 50;
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i + " de " + iteracion);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
