package Java2.Astratta1;

class Triangolo extends Forma {
    public Triangolo(double base, double altezza) {
        this.lunghezza = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return (lunghezza * altezza) / 2;
    }
}
