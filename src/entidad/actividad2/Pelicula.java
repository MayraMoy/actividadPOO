package entidad.actividad2;

/*
    Crear una clase abstracta Pelicula con los atributos titulo y anioEstreno. Definir dos
    métodos abstractos: calcularPuntaje() y calcularDuracionTotal(), ambos con
    retorno double. Agregar un metodo concreto mostrarFicha() que llame a los dos métodos
    abstractos e imprima los resultados con un mensaje claro.
*/
public abstract class Pelicula {
    private String titulo;
    private int anioEstreno;
    private String tipo;

    public Pelicula(String titulo, int anioEstreno, String tipo) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.tipo = tipo;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularPuntaje();
    public abstract double calcularDuracionTotal();

    public void mostrarFicha(){
        System.out.println("");
        System.out.println("=== Ficha de la Pelicula ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Año de Estreno: " + anioEstreno);
        System.out.println("Tipo de Pelicula: " + tipo);
        System.out.println("Puntaje de la Pelicula: " + calcularPuntaje());
        System.out.println("Duracion de la Pelicula: " + calcularDuracionTotal());
    }
}
