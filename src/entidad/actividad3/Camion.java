package entidad.actividad3;

/*
    Camion tendrá capacidadCargaToneladas y un metodo calcularCostoFlete(double
    kmRecorridos) que devuelva el costo del flete calculado como:
    costoFlete = capacidadCargaToneladas × kmRecorridos × 0.5
*/
public class Camion extends Vehiculo{
    private int capacidadCargaToneladas;
    private int kmRecorridos;

    public Camion(String marca, String modelo, int anioFabricacion, int velocidadMaxima, int capacidadCargaToneladas, int kmRecorridos){
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.kmRecorridos = kmRecorridos;
    }

    public double calcularCostoFlete(){
        return capacidadCargaToneladas * kmRecorridos * 0.5;
    }

    @Override
    public void describir(){
        super.describir();
        System.out.println("Capacidad de carga: " + capacidadCargaToneladas);
        System.out.println("Costo del flete para " + kmRecorridos + " recorridos: " + calcularCostoFlete());
    }
}