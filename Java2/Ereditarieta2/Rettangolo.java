package Java2.Ereditarieta2;

public class Rettangolo extends Forma{
    double lunghezza;
    double altezza;
    public Rettangolo(double lunghezza, double altezza){
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }
    public void calcolaArea(){
        double area = lunghezza*altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
