package Java2.Enum1;

enum TipoForma {
    Triangolo,
    Rettangolo;
}


class Forma {

    TipoForma tipo;
    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }
    public void calcolaArea() {
        switch (tipo) {
            case Triangolo:
                System.out.println("L'area del triangolo è: " + calcolaAreaTriangolo());
                break;
            case Rettangolo:
                System.out.println("L'area del rettangolo è: " + calcolaAreaRettangolo());
                break;
        }
    }
    protected double calcolaAreaTriangolo() {
        return 0;
    }
    protected double calcolaAreaRettangolo() {
        return 0;
    }
}
