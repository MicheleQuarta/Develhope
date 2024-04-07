package Java2.DesignPattern.Singleton;

public class User {
    private String nome;
    private int eta;

    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampaInfoUser(){
        System.out.println("Nome: " +nome);
        System.out.println("Età: " + eta);
    }
}
