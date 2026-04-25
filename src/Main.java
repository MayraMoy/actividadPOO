import entidad.actividad1.PokemonAgua;
import entidad.actividad1.PokemonFuego;
import entidad.actividad1.PokemonPlanta;
import entidad.actividad2.PeliculaAccion;
import entidad.actividad2.PeliculaAnimada;
import entidad.actividad2.PeliculaTerror;
import entidad.actividad3.Auto;
import entidad.actividad3.Camion;
import entidad.actividad3.Moto;
import entidad.actividad4.EmpleadoComisionista;
import entidad.actividad4.EmpleadoMensual;
import entidad.actividad4.EmpleadoPorHoras;
import entidad.actividad5.Accesorio;
import entidad.actividad5.Consola;
import entidad.actividad5.Videojuego;
import entidad.actividad6.Aguila;
import entidad.actividad6.Delfin;
import entidad.actividad6.Leon;
import entidad.actividad7.Auricular;
import entidad.actividad7.Smartwatch;
import entidad.actividad7.Telefono;
import entidad.actividad8.CapitanAmerica;
import entidad.actividad8.DoctorStrange;
import entidad.actividad8.Thor;

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

        Auto auto1 = new Auto(
                "Toyota",
                "Corolla",
                2022,
                180,
                4
        );
        auto1.describir();

        Moto moto1 = new Moto(
                "Honda",
                "CB500",
                2021,
                160,
                true
        );
        moto1.describir();

        Camion camion1 = new Camion(
                "Mercedes-Benz",
                "Actros",
                2020,
                120,
                20,
                300
        );
        camion1.describir();

        EmpleadoMensual empleado1 = new EmpleadoMensual(
                "Carlos",
                "Garcia",
                "EMP-001",
                "mensual",
                35000
        );
        empleado1.mostrarLiquidacion();

        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras(
                "Laura",
                "Martínez",
                "EMP-002",
                "Por horas",
                9,
                2000
        );
        empleado2.mostrarLiquidacion();

        EmpleadoComisionista empleado3 = new EmpleadoComisionista(
                "Rodrigo",
                "Perez",
                "EMP-003",
                "Por comision",
                35000,
                20,
                8
        );
        empleado3.mostrarLiquidacion();

        Videojuego producto1 = new Videojuego(
                "The Legend of Zelda: Breath of the Wild",
                59.99,
                25,
                "Aventura",
                12
        );
        producto1.mostrarFicha();

        Consola producto2 = new Consola(
                "PlayStation 5",
                499.99,
                8,
                "PS5",
                1
        );
        producto2.mostrarFicha();

        Accesorio producto3 = new Accesorio(
                "FIFA 25",
                44.99,
                40,
                "ps5"
        );
        producto3.mostrarFicha();

        Leon animal1 = new Leon(
                "Simba",
                "León africano",
                5,
                "Grande"
        );
        animal1.presentarse();

        Delfin animal2 = new Delfin(
                "Flipper",
                "Delfín mular",
                3,
                true
        );
        animal2.presentarse();

        Aguila animal3 = new Aguila(
                "Zeus",
                "Águila real",
                7,
                210
        );
        animal3.presentarse();

        Telefono telefono1 = new Telefono(
                "Samsung Galaxy S24",
                12345678
        );
        telefono1.mostrarEstado();

        Auricular auricular1 = new Auricular(
                "Sony WH-1000XM5",
                "Bluetooth"
        );
        auricular1.mostrarEstado();

        Smartwatch smartwatch1 = new Smartwatch(
                "Apple Watch SE",
                true
        );
        smartwatch1.mostrarEstado();

        Thor thor1 = new Thor(
                95,
                "Mjolnir"
        );
        thor1.mensaje();

        DoctorStrange doctor1 = new DoctorStrange(
                88,
                "Sello de los Vishanti"
        );
        doctor1.mensaje();

        CapitanAmerica capitan1 = new CapitanAmerica(
                80,
                70
        );
        capitan1.mensaje();

    }
}