package entidad.actividad5;

/*• Accesorio tendrá compatibilidad (qué consolas acepta) y un
metodo esCompatible(String consola) que devuelva true o false según si la
compatibilidad contiene el nombre recibido.*/

public class Accesorio extends  Producto{
    private String compatibilidad;

    public Accesorio(String nombre, double precio, int stockDisponible, String compatibilidad){
        super(nombre, precio, stockDisponible);
        this.compatibilidad = compatibilidad;
    }

    public boolean esCompatible(String consola){
        return compatibilidad.toLowerCase().contains(consola.toLowerCase());
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Es compatible: " + esCompatible("ps5"));
    }
}
