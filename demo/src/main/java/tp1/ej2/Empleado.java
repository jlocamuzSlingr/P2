package tp1.ej2;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * Implementa la interfaz "Comparable<Empleado>" y sobrescribe el método 
 * "compareTo" para poder comparar dos empleados 
 * y determinar su orden en una lista.
 */
@Data
@AllArgsConstructor
public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;
    
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido=" + apellido ;
    }
    
    @Override
    public int compareTo(Empleado otroEmpleado) {
        if (this.legajo < otroEmpleado.getLegajo()) {
            return -1;
        } else if (this.legajo > otroEmpleado.getLegajo()) {
            return 1;
        } else {
            return 0;
        }
    }
}
