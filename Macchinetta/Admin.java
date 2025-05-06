import java.util.Scanner;

public class Admin {
    int IdAdmin;
    
    private void aggiungiProdotto(Scanner sc) {
        System.out.println("Inserisci il nome del prodotto da aggiungere:");
        String nome = sc.nextLine();
        System.out.println("Inserisci la quantità da aggiungere:");
        int quantita = Integer.parseInt(sc.nextLine());
        System.out.println("Prodotto aggiunto: " + nome + " - Quantità: " + quantita);
    }


    private void modificaProdotto(Scanner sc) {
        System.out.println("Inserisci il nome del prodotto da modificare:");
        String nomeProdotto = sc.nextLine();
        System.out.println("Inserisci la nuova fila per il prodotto:");
        String nuovaFila = sc.nextLine();
        System.out.println("Prodotto " + nomeProdotto + " modificato con nuova fila: " + nuovaFila);
    }


    private void rimuoviProdotto(Scanner sc) {
        System.out.println("Inserisci il nome del prodotto da rimuovere:");
        String nomeProdotto = sc.nextLine();
        System.out.println("Prodotto " + nomeProdotto + " rimosso.");
    }


}
