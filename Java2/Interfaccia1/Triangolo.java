package Java2.Interfaccia1;

class Triangolo implements Forma {
    double lunghezza;
    double altezza;
    public Triangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return (lunghezza * altezza)/2;
    }
}