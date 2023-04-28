package ej2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaValores = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            int valor = (int) (Math.random() * 13 + 3); // Genera valores aleatorios entre 3 y 15
            listaValores.add(valor);
        }
        System.out.println("Lista de valores: " + listaValores);

        Hilo hilo1 = new Hilo("1", listaValores);
    }}
