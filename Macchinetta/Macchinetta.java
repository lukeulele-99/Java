import java.util.Scanner;

public class Macchinetta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Macchinetta m = new Macchinetta();
        Utente u = new Utente("Luca", "1234");
        Admin ad = new Admin();
        System.out.println(" Benvenuto! Sei UTENTE o ADMIN?");

        if (sc.nextLine().equalsIgnoreCase("utente")) {
            System.out.println("Inserisci nome utente");
            String nome = sc.nextLine();

            System.out.println("Inserisci password utente");
            int password = sc.nextInt();
            sc.nextLine(); // pulizia

            if (nome.equals("Luca") && password == 1234) {
                //stampa menuUtente
                System.out.println("MenuUtente");
            } else {
                System.out.println("Credenziali errate");
            }
        } else {
            System.out.println("Inserisci IdAdmin");
            int idAdmin = sc.nextInt();
            sc.nextLine(); // pulizia

            if (idAdmin == 1000) {
                //Stampa menuAdmin
                System.out.println("MenuAdmin");
            } else {
                System.out.println("ID Admin errato");
            }
        }



    }


    }

