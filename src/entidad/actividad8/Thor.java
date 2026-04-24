package entidad.actividad8;

/*Thor implementa solo Atacable. Tendrá los atributos fuerzaGolpe (int)
y arma (String, por ejemplo: "Mjolnir").*/

public class Thor implements Atacable{
    private int fuerzaGolpe;
    private String arma;

    public Thor(int fuerzaGolpe, String arma) {
        this.fuerzaGolpe = fuerzaGolpe;
        this.arma = arma;
    }

    public Thor() {
    }

    public int getFuerzaGolpe() {
        return fuerzaGolpe;
    }

    public String getArma() {
        return arma;
    }

    public void setFuerzaGolpe(int fuerzaGolpe) {
        this.fuerzaGolpe = fuerzaGolpe;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void atacar(String objetivo) {
        System.out.println("Thor ataca: Thor lanza " + arma + " con una fuerza de " + fuerzaGolpe + " contra " + objetivo + ". ¡BOOM!");
    }

    public void mensaje(){
        atacar("Thanos");
        System.out.println("Thor no puede curar aliados.");
    }
}
