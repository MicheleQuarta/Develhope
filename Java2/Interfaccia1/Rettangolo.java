package Java2.Interfaccia1;

class Rettangolo implements Forma {

    double lunghezza;
    double altezza;
    public Rettangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return lunghezza * altezza;
    }
}