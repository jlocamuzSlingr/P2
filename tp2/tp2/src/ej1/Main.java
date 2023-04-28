package ej1;

public class Main {
    public static void main(String[] args) {
        // Hilos del punto a
        HiloA hiloA1 = new HiloA("A1");
        HiloA hiloA2 = new HiloA("A2");
        HiloA hiloA3 = new HiloA("A3");
        HiloA hiloA4 = new HiloA("A4");
        
        // Hilos del punto b
        HiloB hiloB1 = new HiloB("B1", 15, 200);
        HiloB hiloB2 = new HiloB("B2", 20, 100);
        HiloB hiloB3 = new HiloB("B3", 25, 150);
        HiloB hiloB4 = new HiloB("B4", 30, 75);
        
        // Iniciar todos los hilos
        hiloA1.start();
        hiloA2.start();
        hiloA3.start();
        hiloA4.start();
        new Thread(hiloB1).start();
        new Thread(hiloB2).start();
        new Thread(hiloB3).start();
        new Thread(hiloB4).start();
    }
}
