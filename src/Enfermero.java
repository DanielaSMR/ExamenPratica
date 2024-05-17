import java.util.Random;

public class Enfermero extends Empleado{
    public static int totalEnfermeros;

    public Enfermero(String codigoEmpleado,String categoria,String nombreCompleto,String servicio,boolean turnicidad){
        super(nombreCompleto, servicio, turnicidad);
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

    @Override
    public String toString(){
        return super.toString() + "Total de enfermeros: " + totalEnfermeros; 
    }

    public int getTotalEnfermeros() {
        return totalEnfermeros;
    }

    public void setTotalEnfermeros(int totalEnfermeros) {
        this.totalEnfermeros = totalEnfermeros;
    }


    
}