package entidad;

/*
    Crear una superclase Pokemon con los atributos:
     - nombre,
     - tipo (por ejemplo: Fuego, Agua, Planta),
     - nivel
     - puntos de vida.
    Definir un constructor con todos los atributos, getters y
    setters, y un metodo mostrarInfo() que imprima por consola los datos del Pokémon.
 */


/* Clase Padre Pokemon */
public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private int puntosDeVida;

    /* Definir un Constructor  */
    public Pokemon(String nombre, String tipo, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public Pokemon() {
    }

    /* Getters (leer el valor de un atributo) */
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    /* Setters (se utilizan para asignar o actualizar el valor de un atributo) */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public void mostrarInformacion() {
        System.out.println("");
        System.out.println("=== Informacion del Pokemon ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosDeVida);
        System.out.println("");
    }
}


