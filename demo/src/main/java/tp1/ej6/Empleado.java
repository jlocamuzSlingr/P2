package tp1.ej6;


import java.util.*;

public class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;
    
    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }
    
    public String toString() {
        return apellido + ", " + nombre + " (legajo " + legajo + ", " + aniosTrabajados + " años trabajados)";
    }
    
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "Pérez", 123, 5));
        empleados.add(new Empleado("María", "González", 456, 3));
        empleados.add(new Empleado("Pedro", "Sánchez", 789, 10));
        empleados.add(new Empleado("Ana", "Martínez", 234, 7));
        empleados.add(new Empleado("Luis", "Fernández", 567, 2));
        
        Map<String, Empleado> empleadosMap = new HashMap<>();
        for (Empleado empleado : empleados) {
            String clave = empleado.getApellido() + ", " + empleado.getNombre();
            empleadosMap.put(clave, empleado);
        }
        
        for (Map.Entry<String, Empleado> entry : empleadosMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getLegajo() {
        return legajo;
    }
    
    public int getAniosTrabajados() {
        return aniosTrabajados;
    }
}
