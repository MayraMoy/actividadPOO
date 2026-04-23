package entidad;

/*
    PeliculaTerror tendrá nivelSuspenso (puntaje del 1 al 10) y cantidadSustos (cantidad
    de sustos de la película).
    o calcularPuntaje() = nivelSuspenso * 2.0 + cantidadSustos * 0.5
    o calcularDuracionTotal() = 80 + cantidadSustos * 3.0 (duración estimada en
    minutos)
*/
public class PeliculaTerror extends Pelicula{
    private double nivelSuspenso;
    private int cantidadSustos;

    public PeliculaTerror(String titulo, int anioEstreno, String tipo, double nivelSuspenso, int cantidadSustos) {
        super(titulo, anioEstreno, tipo);
        this.nivelSuspenso = nivelSuspenso;
        this.cantidadSustos = cantidadSustos;
    }

    @Override
    public double calcularPuntaje(){return nivelSuspenso * 2.0 + cantidadSustos * 0.5; }

    @Override
    public double calcularDuracionTotal(){return 80 + cantidadSustos * 3.0; }
}
