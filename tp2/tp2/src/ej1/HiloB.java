package ej1;


public class HiloB implements Runnable {
    
    private String nombre;
    private int iteracion;
    private int delay;
    
    public HiloB(String nombre, int iteracion, int delay) {
        this.nombre = nombre;
        this.iteracion = iteracion;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= iteracion; i++) {
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i + " de " + iteracion);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

