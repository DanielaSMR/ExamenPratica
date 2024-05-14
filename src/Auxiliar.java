import java.util.Random;

public class Auxiliar extends Empleado{
    public static int totalAuxiliares;

    public Auxiliar(String codigoEmpleado,String categoria,String nombreCompleto,String servicio,boolean turnicidad,int totalAuxiliares){
        super(nombreCompleto, servicio, turnicidad);
        totalAuxiliares ++;
    }

    @Override
    public String generarCodigo(){
        Random random = new Random();
        String codigo = "C3" + (1000 + random.nextInt(9000));
        for(int i = 0;i < totalAuxiliares;i++){
            //Comprobar si el codigo se repite
        }
        return codigo;
    }

    public int getTotalAuxiliares() {
        return totalAuxiliares;
    }

    public void setTotalAuxiliares(int totalAuxiliares) {
        this.totalAuxiliares = totalAuxiliares;
    }

    
}