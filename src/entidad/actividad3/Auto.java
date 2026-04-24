package entidad.actividad3;
/* Auto tendrá cantidadPuertas y un metodo abrirBaul() que imprima un mensaje. */

public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int anioFabricacion, int velocidadMaxima, int cantidadDePuertas){
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public void abrilBaul(){
        return;
    }

    @Override
    public void describir(){
        super.describir();
        System.out.println("Se abre el baul del auto ");
    }
}
