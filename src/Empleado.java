public abstract class Empleado {
    private String categoria;
    private final String codigoEmpleado;
    private String nombreCompleto;
    private String servicio;
    private boolean turnicidad;
    private int sueldo;
    public static int totalEmpleados;


    public Empleado(String nombreCompleto, String servicio, boolean turnicidad) {
        this.codigoEmpleado = generarCodigo();
        this.categoria = generarCategoria();
        this.nombreCompleto = nombreCompleto;
        this.servicio = servicio;
        this.turnicidad = turnicidad;
        this.sueldo = sueldoBase();
        totalEmpleados++;
        sueldoTotal();
    }

    public String generarCodigo() {
        return "";
    }

    public void comprobarCodigo(){
        
    }

    public String generarCategoria() {
        if(generarCodigo().contains("A")){
            return "Medic@";
        }else if(generarCodigo().contains("B")){
            return "Enfermer@";
        }else if(generarCodigo().contains("C")){
            return "Auxiliar";
        }else{
            return "";
        }
    }

    public int sueldoTotal(){
        return 1;
    }

    public int sueldoBase() {
        if(generarCodigo().contains("A")){
            return 2000;
        }else if(generarCodigo().contains("B")){
            return 1800;
        }else if(generarCodigo().contains("C")){
            return 1500;
        }else{
            return 0;
        }
    }

    public int suplementos() {
        if(servicio.equals("transplante")){
            return (sueldo * 115)/100;
        }else if(servicio.equals("cirugia")){
            return (sueldo * 110)/100;
        }else if(servicio.equals("quemados")){
            return (sueldo * 105)/100;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "codigo empleado: " + codigoEmpleado + " categoria: " + categoria + " nombre: " + nombreCompleto + " servicio: " + servicio + " turnicidad: "
        + turnicidad + " sueldo: " + sueldoTotal() + " total empleados: " + totalEmpleados;   }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public boolean isTurnicidad() {
        return turnicidad;
    }

    public void setTurnicidad(boolean turnicidad) {
        this.turnicidad = turnicidad;
    }

    public int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setTotalEmpleados(int totalEmpleados) {
        this.totalEmpleados = totalEmpleados;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
    

}