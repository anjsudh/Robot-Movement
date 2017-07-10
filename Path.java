
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Used to maintain Path History of the Robot
 * @author anjana
 */
public class Path{
    HashSet<String> pathHistory;
    
    public Path() {
        this.pathHistory = new LinkedHashSet<String>();
    }
    public Path(HashSet<String> pathHistory) {
        this.pathHistory = new LinkedHashSet<>(pathHistory);
    }
    
    public String toString(){
        StringBuilder str = new StringBuilder("[");
        Iterator<String> iterator = pathHistory.iterator();
        if(iterator.hasNext()){
            str.append(iterator.next());
        }
        while(iterator.hasNext()){
            str.append(",");
            str.append(iterator.next());
        }
        str.append("]");
        return str.toString();
    }
    
    //to improve complexity for contains, will suggest to use a visited variable array
    public boolean isVisited(Position pos){
        return pathHistory.contains(pos.toString());
    }
    
}