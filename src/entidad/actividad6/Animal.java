package entidad.actividad6;

/*
    Crear una clase abstracta Animal con los atributos nombre, especie y edad. Definir los
    metodos abstractos hacerSonido() y moverse(), y un metodo concreto presentarse() que
    llame a ambos e imprima la información del animal.
*/
public abstract class Animal {
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerSonido();
    public abstract void moverse();

    public void presentarse(){
        System.out.println("");
        System.out.println("== Ficha del Animal ==");
        hacerSonido();
        moverse();
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("");
    }
}
