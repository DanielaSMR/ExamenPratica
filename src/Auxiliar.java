import java.util.Random;

public class Auxiliar extends Empleado{
    public static int totalAuxiliares;
    private boolean discapacidad;

    public Auxiliar(String nombreCompleto,String servicio,boolean turnicidad,boolean discapacidad){
        super(nombreCompleto, servicio, turnicidad);
        this.discapacidad = discapacidad;
        totalAuxiliares ++;
    }

    @Override
    public String generarCodigo(){
        String codigo = "C3" + (0000 + totalAuxiliares);
        for(Empleado empleado : Main.empleados){
            if(empleado.getCodigoEmpleado().equals(codigo)){
                codigo = codigo + 1;
            }
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