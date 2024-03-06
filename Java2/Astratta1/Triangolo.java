package Java2.Astratta1;

class Triangolo extends Forma {
    public Triangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return (lunghezza * altezza) / 2;
    }
}
