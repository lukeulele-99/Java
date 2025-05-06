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
                m.mostraProdotti();
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

            } else {
                System.out.println("ID Admin errato.");
            }
        }
    }

    public static void mostraProdotti() {
        // Gruppo i prodotti per categoria
        for (Prodotto.Categoria categoria : Prodotto.Categoria.values()) {
            System.out.println("Categoria: " + categoria);
            for (Prodotto prodotto : Prodotto.values()) {
                if (prodotto.getCategoria() == categoria) {
                    System.out.println(prodotto.getCodice() + " - " + prodotto.getNome());
                }
            }
            System.out.println(); // Separatore tra categorie
        }
    }
}










