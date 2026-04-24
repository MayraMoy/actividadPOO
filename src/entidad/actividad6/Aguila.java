package entidad.actividad6;

/*
    Aguila tendrá envergaduraAlas (en centímetros) y un
    metodo calcularAlturaMaximaVuelo() que devuelva la envergadura multiplicada
    por 15.*/

public class Aguila extends Animal{
    private double envergudurarAlas;

    public Aguila(String nombre, String especie, int edad, double envergudurarAlas){
        super(nombre, especie, edad);
        this.envergudurarAlas = envergudurarAlas;
    }

    public double calcularAlturaMaximaVuelo(){
        return envergudurarAlas * 15;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Emite un agudo chillido");
    }

    @Override
    public void moverse() {
        System.out.println("Planea majestuosamente en las alturas");
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Envergadura de alas: " + envergudurarAlas);
    }
}
