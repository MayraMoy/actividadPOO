package entidad.actividad6;

/* Leon tendrá tamanoMelena (pequeña, mediana, grande). */
public class Leon extends Animal{
    private String tamanoMelena;

    public Leon(String nombre, String especie, int edad, String tamanoMelena){
        super(nombre, especie, edad);
        this.tamanoMelena = tamanoMelena;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Sonido: ¡ROOOAR!");;
    }

    @Override
    public void moverse(){
        System.out.println("Movimiento: Camina sigilosamente por la sabana");
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Tamaño de la melena: " + tamanoMelena);
    }
}
