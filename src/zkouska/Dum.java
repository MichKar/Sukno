package zkouska;

public class Dum implements IPlocha {
    public int pocetOken;
    public double pudorys;


    public Dum(int pocetOken, int pudorys) {
        this.pocetOken = pocetOken;
        this.pudorys = pudorys;
    }


    @Override
    public double sdelPlochu() {
        return pudorys * pocetOken * 0.7;
    }

    @Override
    public String toString() {
        return "Dum{" +
                "pocetOken=" + pocetOken +
                ", pudorys=" + pudorys +
                '}';
    }
}
