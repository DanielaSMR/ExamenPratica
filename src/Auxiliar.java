import java.util.Random;

public class Auxiliar extends Empleado{
    public static int totalAuxiliares;
    private boolean discapacidad;

    public Auxiliar(String codigoEmpleado,String categoria,String nombreCompleto,String servicio,boolean turnicidad,int totalAuxiliares,boolean discapacidad){
        super(nombreCompleto, servicio, turnicidad);
        this.discapacidad = discapacidad;
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

    @Override
    public int sueldoTotal(){
        if(discapacidad){
            return getSueldo()*3/100;           
        }
        return getSueldo();
    }

    @Override
    public String toString(){
        return super.toString() + "Discapacidad: " + discapacidad + "Total de Auxiliares: " + totalAuxiliares; 
    }

    public int getTotalAuxiliares() {
        return totalAuxiliares;
    }

    public void setTotalAuxiliares(int totalAuxiliares) {
        this.totalAuxiliares = totalAuxiliares;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }


    
}