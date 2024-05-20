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
        return super.toString() + "Numero de guardias: " + numGuardias + "Total de medicos: " + totalMedicos; 
    }

    @Override
    public String generarCodigo(){
        String codigo = "A1" + (0000 + totalMedicos);
        for(Empleado empleado : Main.empleados){
            if(empleado.getCodigoEmpleado().equals(codigo)){
                codigo = codigo + 1;
            }
        }
        return codigo;
    }

    @Override
    public int sueldoTotal(){
        try {
            comprobarGuardias();
        } catch (Exception e) {
            e.printStackTrace();
        }
            return getSueldo() + (numGuardias * 30);            
        
    }

    private void comprobarGuardias()throws Exception{
        if(numGuardias <= 5){
            this.numGuardias = numGuardias;
        }else{
            throw new Exception("Numero de guardias excedido"); 
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