package tp1.ej2;

/*
Ejercicio 2
Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
Crear una clase generica ListaGenerica que permita mantener una lista de objetos que implementan la interfaz comparable.
1. Definir un método que permita agregar un elemento a la lista.
2. Definir un método que devuelva la lista de objetos.
3. Definir un método que devuelva la cantidad de elementos almacenados en la lista.
4. Definir un método que permita agregar un elemento al principio de la lista.
5. Definir un método que permita ordenar la lista.  (((?????)))
6. Definir un método que permita desordenar (barajar) la lista.
7. Definir un método que permita almacenar un elemento en una posición particular de la lista, los parámetros que recibe son el objeto a almacenar y la posición en la lista.
8. Definir un método que devuelva el objeto en una posición específica de la lista
9. Definir un método que devuelva el objeto en la primer posición de la lista
10. Definir un método que devuelva el objeto en la ultima posición posición de la lista
11. Definir un método que remueva un objeto en una posición particular de la lista.

 */

public class App {
    public static void main(String[] args) {
        ListaGenerica<Empleado> listaDeEmpleados = new ListaGenerica<>();

        Empleado empleado1 = new Empleado("Juan", "Perez", 123, 2);
        Empleado empleado2 = new Empleado("Maria", "Gomez", 456, 5);
        Empleado empleado3 = new Empleado("Pedro", "Gonzalez", 789, 1);

        listaDeEmpleados.agregar(empleado1);
        listaDeEmpleados.agregar(empleado2);
        listaDeEmpleados.agregar(empleado3);

        System.out.println("Cantidad de empleados en la lista: " + listaDeEmpleados.obtenerCantidadElementos());

        System.out.println("Lista de empleados: ");
        for (Empleado empleado : listaDeEmpleados.obtenerLista()) {
            System.out.println(empleado.toString());
        }

        listaDeEmpleados.agregarAlPrincipio(new Empleado("Jose", "Lopez", 234, 4));

        System.out.println("Primer empleado: " + listaDeEmpleados.obtenerPrimerElemento().toString());
        System.out.println("Ultimo empleado: " + listaDeEmpleados.obtenerUltimoElemento().toString());

        listaDeEmpleados.ordenar();

        System.out.println("Lista de empleados ordenada por nombre: ");
        for (Empleado empleado : listaDeEmpleados.obtenerLista()) {
            System.out.println(empleado.toString());
        }
    }
}
