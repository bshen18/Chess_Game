public class Space {
    private final char FILE; // column letter
    private final byte RANK; // row number
    private final String COLOR;
    private Piece piece = null;

    public Space(char file, byte rank, String color) {
        FILE = file;
        RANK = rank;
        COLOR = color;
    }
}
