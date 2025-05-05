public abstract class Piece {
    protected int x, y;
    protected int rotationStatus; //0-3
    public abstract void rotate(int[][] playground);
    public abstract void moveRight(int[][] playground);
    public abstract void moveLeft(int[][] playground);
    public abstract void moveDown(int[][] playground);
}