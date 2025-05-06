import java.util.Scanner;

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
                System.out.println("Input non valido. Inserisci solo 'utente' o 'admin'.");
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
                System.out.println("Accesso riuscito. MenuUtente:");
               // u.mostraMenuUtente(sc);  // ← chiamata al menu utente
            } else {
                System.out.println("Credenziali errate.");
            }

            // --- Blocco ADMIN ---
        } else if (ruolo.equals("admin")) {
            System.out.println("Inserisci ID Admin:");
            int idAdmin = sc.nextInt();
            sc.nextLine(); // pulizia buffer

            if (idAdmin == 1000) {
                System.out.println("Accesso Admin riuscito. MenuAdmin:");
               // ad.mostraMenuAdmin(sc);  // ← chiamata al menu admin
            } else {
                System.out.println("ID Admin errato.");
            }
        }
    }
}








