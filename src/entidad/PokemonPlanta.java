package entidad;

/* PokemonPlanta tendrá cantidadEsporas. */
public class PokemonPlanta extends Pokemon {
    private int cantidadEsporas;

    public PokemonPlanta(String nombre, String tipo, int nivel, int puntosDeVida, int cantidadEsporas) {
        super(nombre, tipo, nivel, puntosDeVida);
        this.cantidadEsporas = cantidadEsporas;
    }

    public PokemonPlanta(int cantidadEsporas) {
        this.cantidadEsporas = cantidadEsporas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cantidad De Esporas: " + cantidadEsporas);
    }
}
