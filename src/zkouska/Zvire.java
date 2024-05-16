package zkouska;

abstract class Zvire implements IPlocha {
    public int vaha;

    public Zvire(int vaha) {
        this.vaha = vaha;
    }


    @Override
    public double sdelPlochu() {
        return vaha * 2;
    }

}
