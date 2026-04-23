package entidad;

/* PokemonAgua tendrá profundidadNado (en metros) */
public class PokemonAgua extends Pokemon{
    private String profunidadNado;

    public PokemonAgua(String nombre, String tipo, int nivel, int puntosDeVida, String profunidadNado) {
        super(nombre, tipo, nivel, puntosDeVida);
        this.profunidadNado = profunidadNado;
    }

    public PokemonAgua(String profunidadNado) {
        this.profunidadNado = profunidadNado;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Profundidad De Nado: " + profunidadNado);
    }
}
