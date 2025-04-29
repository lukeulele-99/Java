import java.util.HashSet;
import java.util.Scanner;

public class Palindromi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci parole");
        String input = scanner.nextLine();

        // Divido parole per spazi o virgole, non funzionava senza
        String[] parole = input.split("[ ,]+");

        // Uso HashSet per evitare le parole duplicate (intrinseco nella classe)
        HashSet<String> palindromi = new HashSet<>();

        for (String parola : parole) {
            String pulita = parola.trim().toLowerCase();
            if (isPalindromo(pulita)) {
                palindromi.add(pulita);
            }
        }

        // Stampa risultato
        if (palindromi.isEmpty()) {
            System.out.println("Parola non palindroma");
        } else {
            System.out.println("Parole palindrome trovata/e:");
            for (String p : palindromi) {
                System.out.println(p);
            }
        }

        scanner.close();
    }

    // Metodo che controlla se una parola è palindroma
    public static boolean isPalindromo(String parola) {
        int sinistra = 0;
        int destra = parola.length() - 1;
      

        while (sinistra < parola.length()/2) {
            if (parola.charAt(sinistra) != parola.charAt(parola.length()-1 -sinistra)) {
                return false;
            }
            sinistra++;
            
        }

        return true;
    }
}



