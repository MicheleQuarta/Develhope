public class Negozio {
    private String nomeNegozio;
    private Prodotti[] inventario = new Prodotti[1000];
    private int numProdotti= 0;

    public Negozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }

    public void setNomeNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

    public void aggiungiProdotto(Prodotti prodotto){
            if (numProdotti<inventario.length){
                inventario[numProdotti++] = prodotto;
                System.out.println(" il prodotto " + prodotto + "è stato aggiunto");
            }else {
                System.out.println("inventario pieno");
            }
        }
    public void visualizzaInventario(){
        if(numProdotti==0){
            System.out.println("inventario vuoto");
        }else{
            System.out.println("inventario del Negozio: ");
            //for (int i = 0; i < numProdotti ; i++) {
            for (int i = 0; i < inventario.length ; i++) {
                Prodotti prodotti = inventario[i];
                if (prodotti != null) {  //qui bisognava controllare se la posizione del prodotto era diversa da null così da poter stampare il prodotto
                    System.out.println(inventario[i].toString());
                }
            }
        }
    }
    //Bonus punto 5, ricerca per categoria:
    public void cercaCategoria(Categoria categoriaScelta) {
        boolean categoriaTrovata = false;
        for (Prodotti prodotti : inventario) {
            if (prodotti != null && prodotti.getCategoria().equals(categoriaScelta)) {
                categoriaTrovata = true;
                System.out.println("Il prodotto con categoria " + categoriaScelta + " è: " + prodotti);
            }
        }
        if (!categoriaTrovata) {
            System.out.println("Nessun prodotto appartiene a quella categoria.");
        }
    }
}
