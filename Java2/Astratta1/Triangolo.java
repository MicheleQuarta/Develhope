package Java2.Astratta1;

class Triangolo extends Forma {
    // Costruttore
    public Triangolo(double base, double altezza) {
        this.lunghezza = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo per calcolare l'area del triangolo
    @Override
    public double calcolaArea() {
        return (lunghezza * altezza) / 2;
    }
}
