package entidad.actividad7;

/*Telefono implementa ambas interfaces (Conectable y Recargable). Tendrá los
atributos marca y numeroDeTelefono.*/
public class Telefono implements Conectable, Recargable{
    private String marca;
    private int numeroDeTelefono;

    public Telefono(String marca, int numeroDeTelefono) {
        this.marca = marca;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public Telefono() {
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public void conectar(){
        System.out.println(marca + "se conecta a la red WiFi");
    };

    @Override
    public void desconectar(){
        System.out.println(marca + "se desconecta de la red.");
    }

    @Override
    public void cargar(){
        System.out.println("Cargando " + marca + "...");
    }

    @Override
    public void mostrarBateria(){
        System.out.println("Batería de " + marca + " 85%");
    }

    public void mostrarEstado(){
        System.out.println("");
        conectar();
        desconectar();
        cargar();
        mostrarBateria();
        System.out.println("");
    }

}
