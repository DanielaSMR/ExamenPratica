import java.util.Random;

public class Medico extends Empleado{
    public static int totalMedicos;
    private int numGuardias;
    
    public Medico(String codigoEmpleado,String categoria,String nombreCompleto,String servicio,boolean turnicidad,int numGuardias) throws Exception{
        super(nombreCompleto, servicio, turnicidad);
        this.numGuardias = numGuardias;
        comprobarGuardias();
        totalMedicos ++;
    }

    @Override
    public String generarCodigo(){
        Random random = new Random();
        String codigo = "A1" + (1000 + random.nextInt(9000));
        for(int i = 0;i < totalMedicos;i++){
            //Comprobar si el codigo se repite
        }
        return codigo;
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