package Java2.DesignPattern.Factory;

public class Main {
    public static void main(String[] args) {

        Shape cerchio = ShapeFactory.getShape(Forma.CERCHIO);

        cerchio.draw();

        Shape rettangolo = ShapeFactory.getShape(Forma.RETTANGOLO);

        rettangolo.draw();
    }
}
