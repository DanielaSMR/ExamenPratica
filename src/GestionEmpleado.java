import java.util.ArrayList;

public class GestionEmpleado{
    public static void añadirEmpleado() throws NumberFormatException, Exception{

        System.out.println("Dime el nombre");
        String nombre = IO.pedirTexto();
        System.out.println("Dime el servicio");
        String servicio = IO.pedirTexto();
        System.out.println("Tiene turnicidad?");
        Boolean turnicidad = IO.pedirBoolean();
        System.out.println("Que tipo de empleado vas a crear?\n 1-Auxiliar 2-Enfermero 3-Medico");
        int eleccion = (int)Integer.parseInt(IO.pedirTexto());
        if(eleccion == 1){
            System.out.println("tiene discapacidad?");
            Boolean discapacidad = IO.pedirBoolean();
            Auxiliar auxiliar = new Auxiliar(nombre, servicio, turnicidad, eleccion, false);
            Main.empleados.add(auxiliar);
        }else if(eleccion == 2){
            Enfermero enfermero = new Enfermero(nombre, servicio, turnicidad);
            Main.empleados.add(enfermero);
        }else if(eleccion == 3){
            System.out.println("Numero de guardias");
            int numGuardias = IO.pedirEntero();
            Medico medico = new Medico(nombre, servicio, turnicidad, numGuardias);
            Main.empleados.add(medico);
        }
    }

    public static void mostrarEmpleados(){
        for(Empleado empleado : Main.empleados){
            System.out.println("Posicion: " + empleado.getCategoria() + "Codigo: " + empleado.getCodigoEmpleado() + "Nombre: " + empleado.getNombreCompleto());
        }
    }

    public static void mostrarNumEmple(){
        System.out.println(Empleado.totalEmpleados);
    }

    public static void mostrarNumCategoria(){
        System.out.println("Total Auxiliares: " + Auxiliar.totalAuxiliares + "\nTotal Enfermeros: " + Enfermero.totalEnfermeros + "\nTotal Medicos: " + Medico.totalMedicos);
    }


    public static void mostrarEmpleCategoria(){
        for(Empleado empleado : Main.empleados){
            System.out.println(empleado.toString());
        }
    }

    public static void eliminarEmpleado() throws Exception{
        mostrarEmpleados();
        System.out.println("Dime el codigo del empleado");
        String emple = IO.pedirTexto();
        for(Empleado empleado : Main.empleados)
        Main.empleados.remove(emple);
    }

}