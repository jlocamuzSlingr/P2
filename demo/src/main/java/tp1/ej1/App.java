package tp1.ej1;

import java.util.*;

/*
Ejercicio 1
Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
Sobrescribir el método toString() para ver una representación entendible de un objeto de la clase
Crear en la clase de arranque un Set de empleados.
Crear 5 objetos empleado, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
Iterar sobre el set y mostrar los objetos empleados
Crear una herencia de la clase Empleado (EmpleadoSet) y modificarla para que cuando se agreguen EmpleadoSet a un set, los repetidos sean ignorados. Investigar como se hace.
Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.

 */
public class App 
{
    public static void main( String[] args )
    {
        Set<Empleado> setEmpleado = new HashSet<>();
        Empleado empleado1 = new Empleado("Juan", "Pérez", 1, 3);
        Empleado empleado2 = new Empleado("María", "González", 2, 5);
        Empleado empleado3 = new Empleado("Juan", "Pérez", 1, 3);
        Empleado empleado4 = new Empleado("Luis", "Rodríguez", 3, 7);
        Empleado empleado5 = new Empleado("Pedro", "Gómez", 4, 1);
        setEmpleado.add(empleado1);
        setEmpleado.add(empleado2);
        setEmpleado.add(empleado3);
        setEmpleado.add(empleado4);
        setEmpleado.add(empleado5);

        // como son 5 y dos son repite, imprime 4 --> set
        // si hubiese querido que se impriman los 5 --> list
        for (Empleado iterable_element : setEmpleado) {
            System.out.println(iterable_element);
        }

    }
}
