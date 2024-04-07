package Java2.DesignPattern.Factory;

import static Java2.DesignPattern.Factory.Forma.CERCHIO;
import static Java2.DesignPattern.Factory.Forma.RETTANGOLO;

public class ShapeFactory {
    public static Shape getShape(Forma type) {
        switch (type) {
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default:
                throw new IllegalArgumentException("Tipo di forma non supportato");
        }
    }
}
