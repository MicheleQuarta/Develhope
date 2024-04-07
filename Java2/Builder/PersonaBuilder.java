package Java2.DesignPattern.Factory.Builder;

import javax.naming.Binding;

public class PersonaBuilder {
    private String nome;
    private String cognome;



    public PersonaBuilder() {

    }

    public PersonaBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonaBuilder setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }
    public Persona build(){
        return new Persona(nome,cognome,"n.d",0);
    }
    @Override
    public String toString() {
        return "PersonaBuilder{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
