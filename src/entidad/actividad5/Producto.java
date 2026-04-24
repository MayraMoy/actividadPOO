package entidad.actividad5;

/*
    Crear una superclase Producto con los atributos nombre, precio y stockDisponible. Agregar
    un metodo aplicarDescuento(double porcentaje) que modifique el precio del producto
    según el porcentaje recibido, y un metodo mostrarFicha() que muestre todos los datos.
*/
public class Producto {
    private String nombre;
    private double precio;
    private int stockDisponible;

    public Producto(String nombre, double precio, int stockDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public double aplicarDescuento(double porcentaje){
        return precio * porcentaje / 100 ;
    }

    public void mostrarFicha(){
        System.out.println("");
        System.out.println("=== Ficha de Producto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock disponible: " + stockDisponible);
        System.out.println("");
    }
}
