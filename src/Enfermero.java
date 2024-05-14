import java.util.Random;

public class Enfermero extends Empleado{
    public static int totalEnfermeros;
    private boolean discapacidad;

    public Enfermero(String codigoEmpleado,String categoria,String nombreCompleto,String servicio,boolean turnicidad,boolean discapacidad){
        super(nombreCompleto, servicio, turnicidad);
        this.discapacidad = discapacidad;
        totalEnfermeros ++;

    }

    @Override
    public String generarCodigo(){
        Random random = new Random();
        String codigo = "B2" + (1000 + random.nextInt(9000));
        for(int i = 0;i < totalEnfermeros;i++){
            //Comprobar si el codigo se repite
        }
        return codigo;
    }


    public int getTotalEnfermeros() {
        return totalEnfermeros;
    }

    public void setTotalEnfermeros(int totalEnfermeros) {
        this.totalEnfermeros = totalEnfermeros;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    
}