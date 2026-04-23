import entidad.*;

public class Main {
    public static void main(String[] args) {

        PokemonFuego pokemon1 = new PokemonFuego("Charmander", "Fuego", 15, 120, "1200 grados");
        pokemon1.mostrarInformacion();

        PokemonAgua pokemon2 = new PokemonAgua("Squirtle", "Agua", 12, 110, "50 metros");
        pokemon2.mostrarInformacion();

        PokemonPlanta pokemon3 = new PokemonPlanta("Bulbasaur", "Planta", 10, 105, 30);
        pokemon3.mostrarInformacion();

        PeliculaAccion pelicula1 =  new PeliculaAccion(
                "Mission Impossible",
                2023,
                "Acción",
                9.5,
                10);
        pelicula1.mostrarFicha();

        PeliculaTerror pelicula2 = new PeliculaTerror(
                "It",
                2017,
                "Terror",
                17.7,
                35);
        pelicula2.mostrarFicha();

        PeliculaAnimada pelicula3 = new PeliculaAnimada(
                "Toy Story",
                1995,
                "Animada",
                11.2,
                12
        );
        pelicula3.mostrarFicha();
    }
}