package entidad;

/* PokemonFuego tendrá temperaturaLlama (en grados). */
public class PokemonFuego extends Pokemon {
    public String temperaturaLlama;

    public PokemonFuego(String nombre, String tipo, int nivel, int puntosDeVida, String temperaturaLlama) {
        super(nombre, tipo, nivel, puntosDeVida);
        this.temperaturaLlama = temperaturaLlama;
    }

    public PokemonFuego(String temperaturaLlama) {
        this.temperaturaLlama = temperaturaLlama;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Temperatura en Llama: " + temperaturaLlama);
    }
}
