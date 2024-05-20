public class EmpleadoNoEncontrado extends Exception{
    public EmpleadoNoEncontrado(String mensaje){
        super(mensaje);
        mensaje = "Empleado no encontrado";
    }
}
