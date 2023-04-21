package tp1.ej7;

public class Main {
    public static void main(String[] args) throws EmpleadoException{

        Empleado empleado1 = Empleado.metodoEstatico("nOMbre=Pablo, apellIdo=Marquez, LEGAJO=E001, aniosTrabajados=4");
        System.out.println(empleado1);
        Empleado empleado5 = Empleado.metodoEstatico("nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=MARQUEZ");
        System.out.println(empleado5);
        Empleado empleado2 = Empleado.metodoEstatico("nOMbre=Pablo, apellIdo=Marquez, LEGAJO=E001, aniosTrabajados=-7");
        System.out.println(empleado2);



}}