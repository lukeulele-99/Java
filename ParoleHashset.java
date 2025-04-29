import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class ParoleHashset {
    public static void main(String[] args) {
        try {
            File file1 = new File("C:\\Users\\User\\OneDrive - Lipari People\\Desktop\\Java\\coso.csv");
            Scanner sc = new Scanner(file1);

            // HashSet per memorizzare parole uniche, caratteristica del HashSet
            HashSet<String> ripetute = new HashSet<String>();

            while (sc.hasNextLine()) {
                String riga = sc.nextLine();

                // Divide la riga in parole
                String[] parole = riga.split(",");

                for (String parola : parole) {
                    ripetute.add(parola.trim()); // aggiunge la parola ripulita da spazi indesiderati
                }
            }

            sc.close();

            // Stampa le parole uniche
            System.out.println("Parole doppie tolte.");
            for (String p : ripetute) {
                System.out.println(p);
            }

            //non so perchè mi tiene un token "?" prima di Luca doppio

        } catch (FileNotFoundException e) {
            System.out.println("Errore! File non trovato.");
            e.printStackTrace();
        }
    }
}
