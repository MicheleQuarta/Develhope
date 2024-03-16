/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */
package Java2.Hashset;

import java.util.HashSet;

public class Hashset3 {
    public static HashSet<String> listaElementi() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        return hashSet;
    }
    public static void main(String[] args) {

        HashSet<String> hashSet = listaElementi();
        
        String oggettoDaEliminare = "Elemento2";
        for (String elemento : hashSet) {
            if (elemento.equals(oggettoDaEliminare)) {
                hashSet.remove(elemento);
                break;
            }
        }
        hashSet.clear();
        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }

}