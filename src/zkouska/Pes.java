package zkouska;

public class Pes extends Zvire {
    public int cena;

    public Pes(int vaha, int cena) {
        super(vaha);
        this.cena = cena;
    }


    @Override
    public double sdelPlochu() {
        return super.sdelPlochu() * cena /10;
    }

    @Override
    public String toString() {
        return "Pes{" +
                "cena=" + cena +
                '}';
    }
}
