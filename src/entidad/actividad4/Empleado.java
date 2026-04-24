package entidad.actividad4;

/*
    Crear una clase abstracta Empleado con los atributos nombre, apellido y legajo. Definir un
    metodo abstracto calcularSueldo() que devuelva un double, y un metodo
    concreto mostrarLiquidacion() que imprima el nombre completo del empleado y el
    resultado de calcularSueldo().
*/

public abstract  class Empleado {
    private String nombreEmpleado;
    private String apellidoEmpelado;
    private String legajo;
    private String tipo;

    public Empleado(String nombreEmpleado, String apellidoEmpelado, String legajo, String tipo) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpelado = apellidoEmpelado;
        this.legajo = legajo;
        this.tipo = tipo;
    }

    public Empleado() {
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getApellidoEmpelado() {
        return apellidoEmpelado;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setApellidoEmpelado(String apellidoEmpelado) {
        this.apellidoEmpelado = apellidoEmpelado;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularSueldo();

    public void mostrarLiquidacion(){
        System.out.println("=== Liquidacion de Sueldo ===");
        System.out.println("Legajo: " + legajo);
        System.out.println("Empleado: " + nombreEmpleado + "" + apellidoEmpelado);
        System.out.println("Tipo: " + tipo);
    }
}
