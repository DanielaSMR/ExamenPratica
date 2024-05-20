import java.util.*;

public class GestionEmpleado{
    public static void añadirEmpleado() throws NumberFormatException, Exception{
        //Añadir try y catch
        //Añadir excepciones

        Auxiliar a1 = new Auxiliar("Sara","Transplante", false,false);
        Auxiliar a2 = new Auxiliar("Pepe","Cirugia", true,true);
        Enfermero e1 = new Enfermero("Tadeo", "Urgencia", false);
        Enfermero e2 = new Enfermero("Carla", "Quemado", true);
        Medico m1 = new Medico("Fernando", null, false, 2);
        Medico m2 = new Medico("Pepa","Paritorio",true,4);
        Main.empleados.add(a1); 
        Main.empleados.add(a2); 
        Main.empleados.add(e1); 
        Main.empleados.add(e2); 
        Main.empleados.add(m1); 
        Main.empleados.add(m2); 

       /*System.out.println("Dime el nombre");
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
            Auxiliar auxiliar = new Auxiliar(nombre, servicio, turnicidad, eleccion, discapacidad);
            Main.empleados.add(auxiliar);
        }else if(eleccion == 2){
            Enfermero enfermero = new Enfermero(nombre, servicio, turnicidad);
            Main.empleados.add(enfermero);
        }else if(eleccion == 3){
            System.out.println("Numero de guardias");
            int numGuardias = IO.pedirEntero();
            Medico medico = new Medico(nombre, servicio, turnicidad, numGuardias);
            Main.empleados.add(medico);
        }*/
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


    public static void mostrarEmpleCategoria() throws Exception{
        mostrarEmpleados();
        System.out.println("Dime el codigo del empleado");
        String emple = IO.pedirTexto();
        for(Empleado empleado : Main.empleados){
            if(empleado.getCodigoEmpleado().equals(emple))
                System.out.println(empleado);
        }
    }

    public static void eliminarEmpleado() throws Exception{
        mostrarEmpleados();
        System.out.println("Dime el codigo del empleado");
        String emple = IO.pedirTexto();

        Iterator<Empleado> iterator = Main.empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getCodigoEmpleado().equals(emple)) {
                System.out.println("Se eliminará el empleado " + empleado.getNombreCompleto());
                iterator.remove(); // Eliminar el empleado usando el iterador
            }
        }
    }

    public static void ordColeccion(){
        System.out.println("Lista actual");
        mostrarEmpleados();
        Collections.sort(Main.empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getCodigoEmpleado().compareTo(o2.getCodigoEmpleado()); 
            }

        });
        System.out.println("Lista ordenada");
        for(Empleado empleado : Main.empleados){
            System.out.println("Posicion: " + empleado.getCategoria() + "Codigo: " + empleado.getCodigoEmpleado() + "Nombre: " + empleado.getNombreCompleto());
        }
    
    }

    public static void modificarGuardias() throws Exception{
        for(Empleado empleado : Main.empleados){
            if(empleado.getCodigoEmpleado().contains("A"))
            System.out.println("Posicion: " + empleado.getCategoria() + " Codigo: " + empleado.getCodigoEmpleado() + " Nombre: " + empleado.getNombreCompleto());
        }
        String emple = "";
        System.out.println("Dime el codigo del empleado que vas a modificar");
        emple = IO.pedirTexto();
        for(Empleado empleado : Main.empleados){//preguntar a marcos sobre el arraylist empleados
            if(empleado instanceof Medico && empleado.getCodigoEmpleado().equals(emple)){
                System.out.println("Cuantos dias de guardia?(Recuerda esta prohibido mas de 5 dias)");
                int dias = IO.pedirEntero();
                ((Medico) empleado).setNumGuardias(dias);
                System.out.println(empleado.toString());
            }
        }
        
    }


}