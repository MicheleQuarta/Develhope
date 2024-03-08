package Java2.Enum1;

class Triangolo extends Forma {
    double lunghezza;
    double altezza;
    public Triangolo(double lunghezza, double altezza) {
        super(TipoForma.Triangolo);
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    protected double calcolaAreaTriangolo() {
        return (lunghezza * altezza) / 2;
    }
}