package entidad.actividad3;

/*
    Crear una superclase Vehiculo con los
    atributos marca, modelo, anioFabricacion y velocidadMaxima. Definir constructores, getters
    y setters, y un metodo describir() que muestre los datos del vehículo.
*/
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int anioFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void describir(){
        System.out.println("");
        System.out.println("=== Vehiculo ===");
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("El año de fabricacion del vehiculo es: " + anioFabricacion);
        System.out.println("La velocidad maxima del vehiculo es: " + velocidadMaxima);
        System.out.println("");
    }
}
