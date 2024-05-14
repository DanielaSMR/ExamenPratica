public abstract class Empleado {
    private String categoria;
    private final String codigoEmpleado;
    private String nombreCompleto;
    private String servicio;
    private boolean turnicidad;
    public static int totalEmpleados;


    public Empleado(String nombreCompleto, String servicio, boolean turnicidad) {
        this.codigoEmpleado = generarCodigo();
        this.categoria = generarCategoria();
        this.nombreCompleto = nombreCompleto;
        this.servicio = servicio;
        this.turnicidad = turnicidad;
        totalEmpleados++;
    }

    public String generarCodigo() {
        return "";
    }

    public String generarCategoria() {
        if(generarCodigo().contains("A1")){
            return "Medic@";
        }else if(generarCodigo().contains("B2")){
            return "Enfermer@";
        }else if(generarCodigo().contains("C3")){
            return "Auxiliar";
        }else{
            return "";
        }
    }

    public int sueldoTotal() {
        return 1;
    }

    public int sueldoBase() {
        if(generarCodigo().contains("A1")){
            return "Medic@";
        }else if(generarCodigo().contains("B2")){
            return "Enfermer@";
        }else if(generarCodigo().contains("C3")){
            return "Auxiliar";
        }else{
            return "";
        }
    }

    public int suplementos() {
        return 1;
    }

    @Override
    public String toString() {
        return "";
    }

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

    

}