import java.util.ArrayList;
import java.util.Random;

public class Game {
    int[][] playground;
    ArrayList<Piece> pieces; // Cueb, Lsx, Ldx, Ssx, Sdx, HalfCross, Long
    Piece currentPiece;
    boolean gameFinished;
    int punteggio;

    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Game() {
        this.playground = new int[20][15];
        this.pieces = new ArrayList<Piece>();
        genPieces();
        gameFinished = false;
    }

    private void genPieces() {
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int i = random.nextInt(7);
            switch (i) {
                case 0:
                    this.pieces.add(new Cube());
                    break;
                case 1:
                    this.pieces.add(new Lsx());
                    break;
                case 2:
                    this.pieces.add(new Ldx());
                    break;
                case 3:
                    this.pieces.add(new Ssx());
                    break;
                case 4:
                    this.pieces.add(new Sdx());
                    break;
                case 5:
                    this.pieces.add(new HalfCross());
                    break;
                default:
                    this.pieces.add(new Long());
                    break;
            }
        }
    }

    public void start() throws InterruptedException {
        // TODO the game
        renderPlayground();

        dropPiece();

        while (!gameFinished) {
            checkUserInput();
            Thread.sleep(1000);// attendi 1 secondo
            moveDownCurrentPiece();// fai scendere il pezzo di gioco corrente in basso di 1 riga
            renderPlayground();// ristampa il playground

            // TODO: se un pezzo tocca il background dei pezzi o il fondo del playground, il
            // pezzo diventa background e droppiamo un nuovo pezzo
            if (currentPiece.rotationStatus == 0) {
                currentPiece.moveDown(playground);
            }
            // TODO: controlla che se una riga è piena, libero la riga e faccio scendere il
            // background sopra



            // TODO: controlla se il gioco è finito (non c'è più spazio per droppare nuovi
            // oggetti, oppure sono finiti i pezzi)
            
            public boolean gameEnd () {
                if (gameFinished == true) {
                    checkUserInput();
                    for (checkUserInput())

                }
             

        }

        // TODO: punteggio?

    }

    private void renderPlayground() {
        System.out.print('+');
        for (int i = 0; i < playground[0].length; i++) {
            System.out.print('-');
        }
        System.out.println('+');
        for (int i = 0; i < playground.length; i++) {
            System.out.print('|');
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j] == 0) {
                    System.out.print(' ');
                } else {
                    System.out.print('#');
                }
            }
            System.out.println('|');
        }
        System.out.print('+');
        for (int i = 0; i < playground[0].length; i++) {
            System.out.print('-');
        }
        System.out.println('+');
    }

    private void dropPiece() {
        if (pieces.size() > 0) {
            currentPiece = pieces.remove(0);

        }
    }

    private void checkUserInput() {
        Random random = new Random();
        int i = random.nextInt(4);
        switch (i) {
            case 0:
                this.currentPiece.moveLeft(playground);
                break;
            case 1:
                this.currentPiece.moveRight(playground);
                break;
            case 2:
                this.currentPiece.moveDown(playground);
                break;
            default:
                this.currentPiece.rotate(playground);
                break;
        }
    }

    private void moveDownCurrentPiece() {
        // TODO

    }
}
