package Java2.DesignPattern.Factory.Builder;

public class Persona {
    private String nome;
    private String cognome;
    private String indirizzo;
    private int anni;

    public Persona(String nome, String cognome, String indirizzo, int anni) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.anni = anni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }
}
