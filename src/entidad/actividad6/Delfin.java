package entidad.actividad6;

/*Delfin tendrá esEntrenado (booleano) y un metodo realizarTrucos() que solo
imprima el truco si está entrenado.*/

public class Delfin extends Animal{
    private boolean esEntrenado;

    public Delfin(String nombre, String especie, int edad, boolean esEntrenado){
        super(nombre, especie, edad);
        this.esEntrenado = esEntrenado;
    }

    public void realizarTrucos(){
        if (esEntrenado == true){
            System.out.println("piruetas");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println("Emite clicks y silbidos.");
    }

    @Override
    public void moverse() {
        System.out.println("Nada a mucha velocidad");
    }

    @Override
    public void presentarse() {
        super.presentarse();
        realizarTrucos();
    }
}
