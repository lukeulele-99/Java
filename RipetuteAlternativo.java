import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RipetuteAlternativo {
  public static void main(String[] args) {
    try {
      File file1 = new File("C:\\Users\\User\\OneDrive - Lipari People\\Desktop\\Java\\coso.csv");
      Scanner sc = new Scanner(file1);
      String parola = sc.nextLine();
      System.out.println(parola);
      String ripetuta = sc.findInLine(parola.repeat(2));
      
     
      // HashSet<String> parole = new HashSet<String>();
      
      while (parola.contentEquals(sc.nextLine())) {
        
      }

      // while (sc.hasNext(parola))
        sc.close();

    }

    catch (FileNotFoundException e) {
      System.out.println("Errore! File non trovato.");
      e.printStackTrace();

    }

    // come mai stampa "?" ad inizio del csv?

  }
}

