import java.util.ArrayList;

public class Main{

    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        

        int eleccion;
        do{
            System.out.println("Elige una opcion\n"+
            "1- Dar de alta un empleado en el sistema:\n"+
            "2- Mostrar empleados dentro del sistema:\n"+
            "3- Num empleados:\n"+
            "4- Num empleados por categoria:\n"+
            "5- Mostrar un unico empleado con detalles:\n"+
            "6- Eliminar empleado\n"+
            "7- Ordenar coleccion por codigo.\n"+
            "8- Modificar las guardias del medico.\n" +
            "9- Salir del sistema");
            eleccion = (int)Integer.parseInt(IO.pedirTexto());
            switch (eleccion) {
                case 1:
                    GestionEmpleado.añadirEmpleado();
                    break;
                case 2:
                    GestionEmpleado.mostrarEmpleados();;
                    break;
                case 3:
                    GestionEmpleado.mostrarNumEmple();
                    break;
                case 4:
                    GestionEmpleado.mostrarNumCategoria();
                    break;
                case 5:
                    GestionEmpleado.mostrarEmpleCategoria();
                    break; 
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;        
                default:
                    System.out.println("No existe esa opcion");
                    break;
            }
        }while(eleccion != 8);
    }
}