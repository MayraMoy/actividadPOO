package entidad.actividad7;

/*Smartwatch implementa ambas interfaces (Conectable y Recargable). Tendrá los
atributos marca y tieneGPS (booleano).*/
public class Smartwatch implements Conectable, Recargable{
    private String marca;
    private boolean tieneGPS;

    public Smartwatch(String marca, boolean tieneGPS) {
        this.marca = marca;
        this.tieneGPS = tieneGPS;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isTieneGPS() {
        return tieneGPS;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }

    @Override
    public void conectar() {
        System.out.println("Smartwatch "+ marca + " se conecta vía Bluetooth.");
    }

    @Override
    public void desconectar() {
        System.out.println("Smartwatch " + marca + "se desconecta.");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando " + marca + "...");
    }

    @Override
    public void mostrarBateria() {
        System.out.println("Batería de " + marca + " 60%");
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
