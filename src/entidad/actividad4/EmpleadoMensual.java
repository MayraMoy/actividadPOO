package entidad.actividad4;

/* EmpleadoMensual tendrá sueldoBase (monto fijo mensual).
o calcularSueldo() = sueldoBase */

public class EmpleadoMensual extends Empleado {
    private double sueldoBase;

    public EmpleadoMensual(String nombreEmpleado, String apellidoEmpleado, String legajo, String tipo, double sueldoBase ){
        super(nombreEmpleado, apellidoEmpleado, legajo, tipo);
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo(){
        return sueldoBase;
    }

    @Override
    public void mostrarLiquidacion() {
        super.mostrarLiquidacion();
        System.out.println("Sueldo del mes: " + sueldoBase);
    }
}
