import java.util.Scanner;

public class Macchinetta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Macchinetta m = new Macchinetta();
        Utente u = new Utente("Luca", "1234");
        Admin ad = new Admin();
        String ruolo;

        while (true) {
            System.out.println("Benvenuto! Sei UTENTE o ADMIN?");
            ruolo = sc.nextLine();

            if (ruolo.equals("utente") || ruolo.equals("admin")) {
                break;
            } else {
                System.out.println("Input errato. Inserisci solo 'utente' o 'admin'.");
            }
        }

        // --- Blocco UTENTE ---
        if (ruolo.equals("utente")) {
            System.out.println("Inserisci nome utente:");
            String nome = sc.nextLine();

            System.out.println("Inserisci password utente:");
            int password = sc.nextInt();
            sc.nextLine(); // pulizia buffer

            if (nome.equals(u.getNome()) && password == Integer.parseInt(u.getPassword())) {


            } else {
                System.out.println("Credenziali errate.");
            }

            // --- Blocco ADMIN ---
        } else {
            System.out.println("Inserisci ID Admin:");
            int idAdmin = sc.nextInt();
            sc.nextLine();

            if (idAdmin == 1000) {
                System.out.println("Accesso Admin riuscito.");
                m.mostraMenuAdmin(sc);
            } else {
                System.out.println("ID Admin errato.");
            }
        }
    }

    public void mostraMenuAdmin(Scanner sc) {
        boolean continua = true;

        while (true) {
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
                    System.out.println("mostraProdotti()");
                    break;
                case "2":
                    System.out.println("ricarica(sc)");
                    break;
                case "3":
                    System.out.println("aggiungiProdotto");
                    break;
                case "4":
                    System.out.println("modificaProdotto");
                    break;
                case "5":
                    System.out.println("rimuoviProdotto");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    private void rimuoviProdotto(Scanner sc) {
    }

    private void modificaProdotto(Scanner sc) {
    }

    private void aggiungiProdotto(Scanner sc) {
    }

    private void ricarica(Scanner sc) {
    }

    private void mostraProdotti() {

    }


}








