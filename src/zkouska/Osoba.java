package zkouska;

public class Osoba implements IPlocha {
    public int vek;
    public int vyska;

    public String pohlavi;


    public Osoba(int vek, int vyska, String pohlavi) {
        this.vek = vek;
        this.vyska = vyska;
        this.pohlavi = pohlavi;
    }

    @Override
    public double sdelPlochu() {
        double vysledek = 0;
        if (pohlavi.equals("muž")) {
            vysledek = vyska * 5;
        } else {
            vysledek = vyska * 5 * 2;
        }
        return vysledek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "vek=" + vek +
                ", vyska=" + vyska +
                ", pohlavi='" + pohlavi + '\'' +
                '}';
    }
}
