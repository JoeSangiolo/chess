package Pieces;

public class Pawn extends Piece {

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
        /*
            pawns can generally only move one square north (relative), 
            or one square NE/NW if taking an opposing piece
            steps to get valid
        */
    
    }

    @Override
    public int[] getMoveOptions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMoveOptions'");
    }
    
}
