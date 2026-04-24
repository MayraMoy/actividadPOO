package entidad.actividad8;

/*CapitanAmerica implementa ambas interfaces. Tendrá los
atributos fuerzaGolpe (int) y nivelLiderazgo (int).*/
public class CapitanAmerica implements Atacable, Curable {
    private int fuerzaGolpe;
    private int niveLiderazgo;

    public CapitanAmerica(int fuerzaGolpe, int niveLiderazgo) {
        this.fuerzaGolpe = fuerzaGolpe;
        this.niveLiderazgo = niveLiderazgo;
    }

    public CapitanAmerica() {
    }

    public int getFuerzaGolpe() {
        return fuerzaGolpe;
    }

    public int getNiveLiderazgo() {
        return niveLiderazgo;
    }

    public void setFuerzaGolpe(int fuerzaGolpe) {
        this.fuerzaGolpe = fuerzaGolpe;
    }

    public void setNiveLiderazgo(int niveLiderazgo) {
        this.niveLiderazgo = niveLiderazgo;
    }

    @Override
    public void atacar(String objetivo) {
        System.out.println("Capitán América ataca: Capitán América arroja su escudo con una fuerza de " + fuerzaGolpe + " impactando a " + objetivo + "¡Por América!");
    }

    @Override
    public void curar(String aliado) {
        System.out.println("Capitán América cura: Capitán América motiva al equipo y con liderazgo nivel " + niveLiderazgo + "logra que " + aliado + "recupere fuerzas.");
    }

    public void mensaje(){
        System.out.println("");
        atacar("Loki");
        curar("Black Widow");
    }

}
