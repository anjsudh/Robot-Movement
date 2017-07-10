/**
 * Used to indicate the maze in which the Robot travels
 * @author anjana
 */

public class Maze{
    final int length;  
    public Maze(int length) {
        this.length = length;
    }
    public boolean isInside(Position p){
        return!(p.currentX <0 || p.currentX>=length || p.currentY<0 || p.currentY>=length);
    }
    
    public boolean isAtExit(Position p){
        return(p.currentX ==length-1 && p.currentY==length-1);
    }
}

