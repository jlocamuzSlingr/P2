package tp1.ej3;

// Ejercicio 3
// Mejorar al ejercicio anterior agregando las siguientes excepciones.
// Una excepción para la función 7 si el indice es mas grande que la cantidad de elementos de la lista.
// Una excepción para la función 8 si el indice es mayor a la cantidad de elementos en la lista.
// Una excepción para la función 9 y 10 si la lista de elementos es vacía.
// Una excepción para la función 10 si el elemento en la lista no existe.

public class App {
    public static void main(String[] args) {
        ListaGenerica<Integer> lista = new ListaGenerica<Integer>();
        
        lista.agregar(5);
        lista.agregar(2);
        lista.agregar(7);
        
        try {
            lista.removerEnPosicion(5); // Lanzará una excepción debido a que el índice es mayor a la cantidad de elementos en la lista
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        lista.ordenar();
        System.out.println(lista.obtenerLista()); // Imprime: [2, 5, 7]
        
        lista.agregarAlPrincipio(1);
        System.out.println(lista.obtenerLista()); // Imprime: [1, 2, 5, 7]
        
        try {
            lista.obtenerEnPosicion(10); // Lanzará una excepción debido a que el índice es mayor a la cantidad de elementos en la lista
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            lista.obtenerPrimerElemento(); // Imprime: 1
            lista.obtenerUltimoElemento(); // Imprime: 7
            lista.removerEnPosicion(0);
            lista.almacenarEnPosicion(6, 1);
            System.out.println(lista.obtenerLista()); // Imprime: [2, 6, 5, 7]
            lista.desordenar();
            System.out.println(lista.obtenerLista()); // Imprime una lista desordenada
            lista.removerEnPosicion(4); // Lanzará una excepción debido a que el índice es mayor a la cantidad de elementos en la lista
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
