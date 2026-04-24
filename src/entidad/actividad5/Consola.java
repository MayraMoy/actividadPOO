package entidad.actividad5;

/*Consola tendrá generacion (PS5, Xbox Series X, etc.) y cantidadControlesIncluidos.
Agregar un metodo calcularPrecioConJuego(double precioJuego) que devuelva el
precio total de la consola más el juego.*/
public class Consola extends Producto{
    private String generacion;
    private int cantidadControlesIncuidos;

    public Consola(String nombre, double precio, int stockDisponible, String generacion, int cantidadControlesIncuidos){
        super(nombre,precio,stockDisponible);
        this.generacion = generacion;
        this.cantidadControlesIncuidos = cantidadControlesIncuidos;
    }

    public double calcularPrecioConJuego(double precioJuego){
        return getPrecio() + precioJuego;
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Precio total de la consola + el juego: " + calcularPrecioConJuego(59.99));
    }
}
