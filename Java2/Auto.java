/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
 */

package Java2;

public class Auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public static void main(String[] args) {
        Auto auto1 = new Auto(2000, "AB123CD", "Fiat", "Panda");
        System.out.println("La mia auto ha cilindrata: " + auto1.getCilindrata());
        System.out.println("La mia auto ha targa: " + auto1.getTarga());
        System.out.println("La mia auto è della marca: " + auto1.getMarca());
        System.out.println("Il modello della mia auto è: " + auto1.getModello());
    }
}

