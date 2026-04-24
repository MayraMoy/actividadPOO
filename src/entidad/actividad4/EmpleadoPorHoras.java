package entidad.actividad4;

/*EmpleadoPorHoras tendrá horasTrabajadas y valorPorHora.
o calcularSueldo() = horasTrabajadas * valorPorHora */

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double valorPorHora;

    public EmpleadoPorHoras(String nombreEmpleado, String apellidoEmpleado, String legajo, String tipo,double horasTrabajadas, double valorPorHora ){
        super(nombreEmpleado, apellidoEmpleado, legajo, tipo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularSueldo(){
        return horasTrabajadas * valorPorHora;
    }

    @Override
    public void mostrarLiquidacion(){
        super.mostrarLiquidacion();
        System.out.println("Sueldo del mes: " + calcularSueldo());
    }
}
