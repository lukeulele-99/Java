import java.util.ArrayList;
import java.util.Scanner;

public class Utente {
    String nome = "Luca";
    String password = "1234";
    //ArrayList<Prodotto> carrello;

    public Utente(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    /* public void mostraMenuUtente(Scanner sc) {
        boolean continua = true;
        while (continua) {
            System.out.println("=== Menu Utente ===");
            System.out.println("1. Compra");
            System.out.println("2. Visualizza ultimo acquisto");
            System.out.println("3. Mostra carrello");
            System.out.println("4. Torna al menu principale");

            String scelta = sc.nextLine();

            switch (scelta) {
                case "1":
                    compraProdotto(sc);
                    break;
                case "2":
                    visualizzaUltimoAcquisto();
                    break;
                case "3":
                    mostraCarrello();
                    break;
                case "4":
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    private void mostraCarrello() {
    }

    private void visualizzaUltimoAcquisto() {
    }

    private void compraProdotto(Scanner sc) {
    }

*/

}




