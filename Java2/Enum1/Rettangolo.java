package Java2.Enum1;

class Rettangolo extends Forma {
    double lunghezza;
    double altezza;

    public Rettangolo(double lunghezza, double altezza) {
        super(TipoForma.Rettangolo);
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    @Override
    protected double calcolaAreaRettangolo() {
        return lunghezza * altezza;
    }
}
