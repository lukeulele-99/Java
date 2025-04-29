import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Tris {
    // Campo di gioco (linee, divisione in matrice, Giocatore.move)
    char[][] campo = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
    // Giocatore (Nome)
    String giocatore1 = "X";
    String giocatore2 = "O";

    /* public stampaCampo() {

        return campo;

    } */

    // isVittoria();

public void Turno (){
    
    for (char[] cs : campo) {
        System.out.println("Turno" + cs);
    }


    
}

    public static void main(String[] args) {
        System.out.println();

        
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi gioca per iniziare");
        Tris partita = new Tris();
        String commando = sc.nextLine();

        if (commando.equals("gioca")) {

            System.out.println("Inserisci il nome del giocatore1");
            partita.giocatore1 = sc.nextLine();

            System.out.println("Inserisci il nome del giocatore2");
            partita.giocatore2 = sc.nextLine();

        

            System.out.println(partita.giocatore1 + " fai la tua mossa");

            String mossa = sc.nextLine();

            System.out.println(partita.giocatore2 + " fai la tua mossa");

        }

        else {

            System.out.println(" Gioco non avviato");
        }

        sc.close();

    }

}

// MODELLI generali

// AZIONI possibili
// Digitare "Gioca" per entrare nella selezione giocatore
// Scelta giocatore 1 (X) o giocatore 2 (O)
// Inserire nome giocatore 1
// System.out.println(" Inserisci il nome di giocatore1 ");
// Inserire nome giocatore 2
// System.out.println(" Inserisci il nome di giocatore2 ");
// Stampiamo Campo di gioco con valori Clear
// input Mossa nomegiocatore 1 (con rispettiva posizione di matrice)
// si occupa lo slot del Campo
// input Mossa nomegiocatore 2
// si occupa lo slot del Campo
// input mossa nomegiocatore 1
// si occupa lo slot del Campo
// input mossa nomegiocatore 2
// si occupa lo slot del Campo
// input mossa nomegiocatore 1
// si occupa lo slot del Campo
// verifica se nomegiocatore 1 ha vinto, else continue
// input mossa nomegiocatore 2
// verifica se nomegiocatore 2 ha vinto, else continue
// avanti con le mosse fino a che il giocatore vince o pareggia
// se vittoria, dichiara nomegiocatore con statement "Vittoria!"
// else dichiara nomegiocatore "pareggio"
// se nomegiocatore 1/2 vince 3 partite, allora "syso("nomegiocatore + "è
// invincibile!")"
