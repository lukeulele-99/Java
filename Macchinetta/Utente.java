import java.util.ArrayList;
import java.util.Scanner;

public class Utente {
    String nome = "Luca";
    String password = "1234";
    ArrayList<Prodotto> carrello;
    private Prodotto ultimoAcquisto;

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





}




