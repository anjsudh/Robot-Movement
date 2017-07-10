/**
 * Used to indicate a particular position of the Robot
 * @author anjana
 */
public class Position{
    int currentX;
    int currentY;
        
    public Position() {
        this.currentX=0;
        this.currentY=0;
    }
    public Position(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
    }
    public String toString(){
        return "("+currentX+","+currentY+")";
    }
}