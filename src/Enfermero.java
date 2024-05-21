import java.util.Random;

public class Enfermero extends Empleado{
    public static int totalEnfermeros;

    public Enfermero(String nombreCompleto,String servicio,boolean turnicidad){
        super(nombreCompleto, servicio, turnicidad);
        totalEnfermeros ++;

    }

    @Override
    public String generarCodigo(){
        String codigo = "B2" + (0000 + totalEnfermeros);
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