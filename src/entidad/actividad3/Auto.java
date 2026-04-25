package entidad.actividad3;
/* Auto tendra cantidadPuertas y un metodo abrirBaul() que imprima un mensaje. */

public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int anioFabricacion, int velocidadMaxima, int cantidadDePuertas){
        super(marca, modelo, anioFabricacion, velocidadMaxima);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public void abrilBaul(){
        System.out.println("Se abre el baul del auto ");
    }

    @Override
    public void describir(){
        super.describir();
        abrilBaul();
    }
}
