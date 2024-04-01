package Pieces;

abstract class Piece {
    // what properites do all pieces need?
    /*
     * 1. need to move (permitted movements dependent on piece)
     * 2. need to have an identifying character (ex. P for Pawn, Q for Queen, etc.)
     * 3. should have an instance-specific location tied to it (to update on the board)
     */
    private int[] currentPosition = {0,0};
    public int[] getCurrentPosition() {
        return this.currentPosition;
    }
    public abstract int[] getMoveOptions();
    public abstract void move(); // should be able to just set piece's current loc to new loc
    
}
