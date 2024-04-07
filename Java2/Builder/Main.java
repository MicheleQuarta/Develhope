package Java2.DesignPattern.Factory.Builder;
/*
Crea una classe Persona con i campi Nome, Cognome, anni e indirizzo, i getter e i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Persona e stamparli a video
 */
public class Main {
    public static void main(String[] args) {
     PersonaBuilder builder =new PersonaBuilder();
     builder.setNome("Luca");
     builder.setCognome("Spedicato");
     Persona persona1 = builder.build();
        System.out.println("Persona 1:");
        System.out.println("Nome: " + persona1.getNome());
        System.out.println("Cognome: " + persona1.getCognome());
        System.out.println("Età: " + persona1.getAnni());
        System.out.println("Indirizzo: " + persona1.getIndirizzo() + " \n");

        Persona persona2 = new Persona("Michele","Quarta","Michelangelo",25);
        System.out.println("Persona 2:");
        System.out.println("Nome: " + persona2.getNome());
        System.out.println("Cognome: " + persona2.getCognome());
        System.out.println("Età: " + persona2.getAnni());
        System.out.println("Indirizzo: " + persona2.getIndirizzo());
    }
}
