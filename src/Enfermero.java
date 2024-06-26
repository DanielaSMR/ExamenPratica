import java.util.Random;

public class Enfermero extends Empleado{
    public static int totalEnfermeros;

    public Enfermero(String nombreCompleto,String servicio,boolean turnicidad){
        super(nombreCompleto, servicio, turnicidad);
        totalEnfermeros ++;

    }

    @Override
    public String generarCodigo(){
        String codigo = "B2";
        if(totalEnfermeros < 10) codigo += "000" + totalEnfermeros;
        if(totalEnfermeros < 100 && totalEnfermeros >= 10) codigo += "00" + totalEnfermeros;
        if(totalEnfermeros < 1000 && totalEnfermeros >= 100) codigo += "0" + totalEnfermeros;
        return codigo;
    }

    @Override
    public String toString(){
        return super.toString() + " Total de enfermeros: " + totalEnfermeros; 
    }

    @Override
    public int sueldoTotal(){
        return getSueldo();            
    }

    public int getTotalEnfermeros() {
        return totalEnfermeros;
    }

    public void setTotalEnfermeros(int totalEnfermeros) {
        this.totalEnfermeros = totalEnfermeros;
    }


    
}