import java.util.Scanner;

public class Admin {
    int IdAdmin;

    /* public void mostraMenuAdmin(Scanner sc) {
        boolean continua = true;

        while (continua) {
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Mostra tutti i prodotti");
            System.out.println("2. Ricarica");
            System.out.println("3. Aggiungi prodotto");
            System.out.println("4. Modifica prodotto");
            System.out.println("5. Rimuovi prodotto");
            System.out.println("6. Torna indietro al menu principale");

            String scelta = sc.nextLine();

            switch (scelta) {
                case "1":
                    mostraProdotti();
                    break;
                case "2":
                    ricarica(sc);
                    break;
                case "3":
                    aggiungiProdotto(sc);
                    break;
                case "4":
                    modificaProdotto(sc);
                    break;
                case "5":
                    rimuoviProdotto(sc);
                    break;
                case "6":
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }


    private void mostraProdotti() {
        System.out.println("=== Prodotti disponibili ===");
        // Prodotti suddivisi in linee, come richiesto
        System.out.println("Linea A: Snack");
        System.out.println("1. Tronky 1 - 1,50€ - Quantità: 20");
        System.out.println("2. Kinder Bueno 2 - 1,50€ - Quantità: 20");
        // Aggiungi tutti i prodotti che vuoi visualizzare
        System.out.println("Linea B: Patatine");
        System.out.println("1. San carlo 1 - 1.80€ - Quantità: 30");
        // Aggiungi i prodotti per la linea B, C, D
    }

    // Metodo per ricaricare (Cassa o Prodotto)
    private void ricarica(Scanner sc) {
        System.out.println("Scegli tipo di ricarica:");
        System.out.println("1. Cassa");
        System.out.println("2. Prodotto");
        String sceltaRicarica = sc.nextLine();

        switch (sceltaRicarica) {
            case "1":
                // Ricarica cassa
                System.out.println("Ricarica cassa selezionata.");
                break;
            case "2":
                // Ricarica prodotto
                System.out.println("Ricarica prodotto selezionata.");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    }


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

     */
}
