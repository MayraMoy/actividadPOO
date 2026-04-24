package entidad.actividad7;

/*Auricular implementa solo Conectable. Tendrá los
atributos marca y tipoDeConexa (Bluetooth, cable, USB-C).*/
public class Auricular implements Conectable {
    private String marca;
    private String tipoDeConexa;

    public Auricular(String marca, String tipoDeConexa) {
        this.marca = marca;
        this.tipoDeConexa = tipoDeConexa;
    }

    public Auricular() {
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoDeConexa() {
        return tipoDeConexa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoDeConexa(String tipoDeConexa) {
        this.tipoDeConexa = tipoDeConexa;
    }

    @Override
    public void conectar(){
        System.out.println("Auricular " + marca + " se conecta vía Bluetooth.");
    }

    @Override
    public void desconectar(){
        System.out.println("Auricular " + marca + " se desconecta.");
    }

    public void mostrarEstado(){
        System.out.println("");
        conectar();
        desconectar();
        System.out.println("");
    }
}
