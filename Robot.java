/**
 * Used to denote a real life Robot
 * @author anjana
 */
public class Robot {
    void move(Position pos, Path path, Maze m){
        if(!m.isInside(pos) || path.isVisited(pos)) {
            return;
        }
        path = new Path(path.pathHistory);
        path.pathHistory.add(pos.toString());
        if(m.isAtExit(pos)){
            System.out.println(path);
            return;
        }
        
        move(new Position(pos.currentX,pos.currentY-1),path, m);
        move(new Position(pos.currentX,pos.currentY+1),path, m);
        move(new Position(pos.currentX-1,pos.currentY),path, m);
        move(new Position(pos.currentX+1,pos.currentY),path, m);
    }
    
    public static void main(String args[]){
        new Robot().move(new Position(), new Path(), new Maze(4));
    }
}
