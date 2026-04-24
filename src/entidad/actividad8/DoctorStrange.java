package entidad.actividad8;

/*DoctorStrange implementa solo Curable. Tendrá los atributos nivelMagia (int)
y hechizo (String, por ejemplo: "Sello de los Vishanti").*/
public class DoctorStrange implements Curable{
    private int nivelMagia;
    private String hechizo;

    public DoctorStrange(int nivelMagia, String hechizo) {
        this.nivelMagia = nivelMagia;
        this.hechizo = hechizo;
    }

    public DoctorStrange() {
    }

    public int getNivelMagia() {
        return nivelMagia;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setNivelMagia(int nivelMagia) {
        this.nivelMagia = nivelMagia;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public void curar(String aliado) {
        System.out.println("Doctor Strange cura: Doctor Strange lanza el " + hechizo + " y restaura la energía de " + aliado );
    }

    public void mensaje(){
        System.out.println("");
        System.out.println("Doctor Strange no puede atacar directamente.");
        curar("Iron Man");
        System.out.println("(Nivel de magia: " + nivelMagia);
    }
}
