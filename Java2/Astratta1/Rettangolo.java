package Java2.Astratta1;

class Rettangolo extends Forma {
    public Rettangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return lunghezza * altezza;
    }
}