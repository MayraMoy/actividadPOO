package entidad.actividad5;

/* Videojuego tendrá genero (acción, aventura, deportes, etc.) y clasificacionEdad.
Sobreescribir mostrarFicha() incluyendo estos datos. */
public class Videojuego extends Producto{
    private String genero;
    private int clasificacionEdad;

    public Videojuego(String nombre, double precio, int stockDisponible, String genero, int clasificacionEdad){
        super(nombre, precio, stockDisponible);
        this.genero = genero;
        this.clasificacionEdad = clasificacionEdad;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Genero: " + genero);
        System.out.println("Clasificacion de edad: " + clasificacionEdad);
    }
}
