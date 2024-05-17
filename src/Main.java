public class Main{
    public static void main(String[] args) throws Exception {
        

        Medico uno = new Medico("Dan", "a", true, 4);
        Medico dos = new Medico("A", "a", false, 4);

        System.out.println(uno.toString());

        int eleccion;
        do{
            System.out.println("Elige una opcion\n"+
            "1- Dar de alta un empleado en el sistema:\n"+
            "2- Búsqueda de libros dentro del sistema\n"+
            "3- Dar de baja un libro en el sistema.\n"+
            "4- Alquiler de un libro por un usuario.\n"+
           "5- Devolución de un libro por un usuario.\n"+
            "6- Gestión de empleados/as de la biblioteca.\n"+
            "7- Gestión de usuarios/as de la biblioteca.\n"+
            "8- Salir del sistema.");
            eleccion = (int)Integer.parseInt(IO.pedirTexto());
            switch (eleccion) {
                case 1://comprobar si es correcta
                    GestionLibro.nuevoLibro(st);
                    break;
                case 2:
                    GestionLibro.buscarLibro("2",st);
                    break;
                case 3:
                    GestionLibro.buscarLibro("3",st);
                    break;
                case 4:
                    GestionLibro.alquilarLibro(st);
                    break;
                case 5:
                    GestionLibro.devolucionLibro(st);
                    break; 
                case 6:
                    GestionEmple.buscarEmpleado(st);
                    break;
                case 7:
                    GestionUsu.buscarUsuario(st);
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