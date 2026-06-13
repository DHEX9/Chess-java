public class Main {
    public static final String RESET = "\u001B[0m";

    public static final String WHITE_PIECE = "\u001B[97m"; // branco brilhante
    public static final String BLACK_PIECE = "\u001B[30m"; // preto
    public static void main(String[] args) {
        System.out.print(WHITE_PIECE + "♙" + RESET);
        System.out.print(BLACK_PIECE + "♟" + RESET);
    }
}