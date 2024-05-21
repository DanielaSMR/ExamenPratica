import java.util.Random;

public class Medico extends Empleado{
    public static int totalMedicos;
    private int numGuardias;
    
    public Medico(String nombreCompleto,String servicio,boolean turnicidad,int numGuardias) throws Exception{
        super(nombreCompleto, servicio, turnicidad);
        this.numGuardias = numGuardias;
        comprobarGuardias();
        setSueldo(sueldoTotal());
        totalMedicos ++;
    }

    @Override
    public String toString(){
        return super.toString() + " Numero de guardias: " + numGuardias + " Total de medicos: " + totalMedicos; 
    }

    @Override
    public String generarCodigo(){
        String codigo = "A1";
        if(totalMedicos < 10) codigo += "000" + totalMedicos;
        if(totalMedicos < 100 && totalMedicos >= 10) codigo += "00" + totalMedicos;
        if(totalMedicos < 1000 && totalMedicos >= 100) codigo += "0" + totalMedicos;
        return codigo;
    }

    @Override
    public int sueldoTotal(){
        return getSueldo() + (numGuardias * 30);            
        
    }

    private void comprobarGuardias(){
        try {
            if(numGuardias <= 5){
                this.numGuardias = numGuardias;
            }else{
                throw new Exception("Numero de guardias excedido"); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    

    public int getTotalMedicos() {
        return totalMedicos;
    }

    public void setTotalMedicos(int totalMedicos) {
        this.totalMedicos = totalMedicos;
    }

    public int getNumGuardias() {
        return numGuardias;
    }

    public void setNumGuardias(int numGuardias) {
        this.numGuardias = numGuardias;
    }

    

}