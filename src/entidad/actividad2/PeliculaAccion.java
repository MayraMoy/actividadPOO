package entidad.actividad2;

/*
    PeliculaAccion tendrá efectosEspeciales (puntaje del 1 al 10)
    y secuenciasDeAccion (cantidad).
    o calcularPuntaje() = efectosEspeciales * 1.5 + secuenciasDeAccion * 0.8
    o calcularDuracionTotal() = 90 + secuenciasDeAccion * 5.0 (duración estimada en
    minutos)
*/
public class PeliculaAccion extends Pelicula {
    private double efectosEspeciales;
    private int secuenciasDeAccion;

    public PeliculaAccion(String titulo, int anioEstreno, String tipo,
                          double efectosEspeciales, int secuenciasDeAccion) {
        super(titulo, anioEstreno, tipo);
        this.efectosEspeciales = efectosEspeciales;
        this.secuenciasDeAccion = secuenciasDeAccion;
    }

    @Override
    public double calcularPuntaje() {
        return efectosEspeciales * 1.5 + secuenciasDeAccion * 0.8;
    }

    @Override
    public double calcularDuracionTotal() {
        return 90 + secuenciasDeAccion * 5.0;
    }
}
