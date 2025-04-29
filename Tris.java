import java.util.Arrays;
import java.util.Scanner;

public class Tris {
    String giocatore1;
    String giocatore2;
    char[][] griglia = new char[3][3];

    public Tris() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(griglia[i], ' ');
        }
    }

    public boolean isValid(int riga, int colonna) {
        return riga >= 0 && riga < 3 && colonna >= 0 && colonna < 3 && griglia[riga][colonna] == ' ';
    }

    public void stampaGriglia() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(griglia[i]));
        }
    }

    public boolean haVinto(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (griglia[i][0] == simbolo && griglia[i][1] == simbolo && griglia[i][2] == simbolo)
                return true;
            if (griglia[0][i] == simbolo && griglia[1][i] == simbolo && griglia[2][i] == simbolo)
                return true;
        }
        if (griglia[0][0] == simbolo && griglia[1][1] == simbolo && griglia[2][2] == simbolo)
            return true;
        if (griglia[0][2] == simbolo && griglia[1][1] == simbolo && griglia[2][0] == simbolo)
            return true;
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (griglia[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tris partita = new Tris();

        System.out.println("Scrivi 'gioca' per iniziare");
        String comando = sc.nextLine();

        if (!comando.equalsIgnoreCase("gioca")) {
            System.out.println("Gioco non avviato.");
            sc.close();
            return;
        }

        System.out.println("Inserisci il nome del giocatore 1:");
        partita.giocatore1 = sc.nextLine();

        System.out.println("Inserisci il nome del giocatore 2:");
        partita.giocatore2 = sc.nextLine();

        String currentPlayer = partita.giocatore1;
        char simbolo = 'X';

        while (true) {
            System.out.println(currentPlayer + ", fai la tua mossa (riga colonna):");
            int riga = sc.nextInt();
            int colonna = sc.nextInt();
            sc.nextLine();

            if (!partita.isValid(riga, colonna)) {
                System.out.println("Mossa non valida. Riprova.");
                continue;
            }

            partita.griglia[riga][colonna] = simbolo;
            partita.stampaGriglia();

            if (partita.haVinto(simbolo)) {
                System.out.println("Complimenti " + currentPlayer + ", hai vinto!");
                break;
            }

            if (partita.isFull()) {
                System.out.println("Pareggio!");
                break;
            }

            if (currentPlayer.equals(partita.giocatore1)) {
                currentPlayer = partita.giocatore2;
                simbolo = 'O';
            } else {
                currentPlayer = partita.giocatore1;
                simbolo = 'X';
            }
        }

        sc.close();
    }
}
