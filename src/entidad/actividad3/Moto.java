package entidad.actividad3;

/* Moto tendrá tieneCajuela (booleano) y un metodo hacerCaballito() que imprima un
mensaje. */

public class Moto extends Vehiculo {
    private boolean tieneCajuela;

    public Moto(String marca, String modelo, int anioFabricacion, int velocidadMaxima, boolean tieneCajuela){
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.tieneCajuela = tieneCajuela;
    }
    public void hacerCaballito(){
        return;
    }

    @Override
    public void describir(){
        super.describir();
        System.out.println("Se empina sobre la rueda trasera! ");
    }
}
