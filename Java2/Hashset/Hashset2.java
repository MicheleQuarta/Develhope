/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */

package Java2.Hashset;
import java.util.HashSet;

public class Hashset2 {
    public static HashSet<String> listaElementi() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        return hashSet;
    }
    public static void main(String[] args) {

        HashSet<String> hashSet = listaElementi();

        String nuovoElemento = "NuovoElemento";
        hashSet.add(nuovoElemento);

        if (hashSet.contains(nuovoElemento)) {
            System.out.println(nuovoElemento + " è parte dell'HashSet.");
        } else {
            System.out.println(nuovoElemento + " non è parte dell'HashSet.");
        }
    }


}