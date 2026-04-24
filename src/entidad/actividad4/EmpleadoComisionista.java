package entidad.actividad4;

/* EmpleadoComisionista tendrá sueldoBase, porcentajeComision y totalVentas.
o calcularSueldo() = sueldoBase + (totalVentas * porcentajeComision / 100) */

public class EmpleadoComisionista extends Empleado{
    private double sueldoBase;
    private double porcentajeComision;
    private int totalVentas;

    public EmpleadoComisionista(String nombreEmpleado, String apellidoEmpleado, String legajo, String tipo, double sueldoBase, double porcentajeComision, int totalVentas){
        super(nombreEmpleado, apellidoEmpleado, legajo, tipo);
        this.sueldoBase = sueldoBase;
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    public double calcularSueldo(){
        return sueldoBase * (totalVentas * porcentajeComision / 100 );
    }

    @Override
    public void mostrarLiquidacion(){
        super.mostrarLiquidacion();
        System.out.println("Sueldo del mes: " + calcularSueldo());
    }
}
