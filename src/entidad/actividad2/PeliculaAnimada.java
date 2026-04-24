package entidad.actividad2;

/*
    PeliculaAnimada tendrá nivelAnimacion (puntaje del 1 al 10) y cantidadPersonajes.
    - calcularPuntaje() = nivelAnimacion * 2.0 + cantidadPersonajes * 0.3
    - calcularDuracionTotal() = 75 + cantidadPersonajes * 1.5 (duración estimada
    en minutos)
*/
public class PeliculaAnimada extends Pelicula {
    private double nivelAnimacion;
    private int cantidadPersonajes;

    public PeliculaAnimada(String titulo, int anioEstreno, String tipo, double nivelAnimacion, int cantidadPersonajes){
        super(titulo, anioEstreno, tipo);
        this.nivelAnimacion = nivelAnimacion;
        this.cantidadPersonajes = cantidadPersonajes;
    }

    @Override
    public double calcularPuntaje(){return nivelAnimacion * 2.0 + cantidadPersonajes * 0.3; }

    @Override
    public double calcularDuracionTotal(){return 75 + cantidadPersonajes * 1.5;}
}
