public class Main {
    public static void main(String[] args) {

        Prodotti prodotto1 = new Prodotti("lacca",10.40,Categoria.BENESSERE);
        Prodotti prodotto2 = new Prodotti("vitello",20.30,Categoria.ALIMENTARI);
        Prodotti prodotto3 = new Prodotti("maglia",12.40,Categoria.VESTIARO);

        Negozio negozio1 = new Negozio("coop");

        negozio1.aggiungiProdotto(prodotto1);
        negozio1.aggiungiProdotto(prodotto2);
        negozio1.visualizzaInventario();

        negozio1.cercaCategoria(Categoria.ALIMENTARI);

    }
}