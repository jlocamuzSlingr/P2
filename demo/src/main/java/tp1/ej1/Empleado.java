package tp1.ej1;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
lombok
In the example above, the @Data annotation generates getters, setters, a toString()
method, an equals() method, and a hashCode() method for the Empleado class. 
 */

@Data
@AllArgsConstructor
public class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido=" + apellido ;
    }
}