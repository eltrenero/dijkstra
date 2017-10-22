import java.util.ArrayList;
import java.util.List;

public class Node {
    public String name;
    public List<Edge> connections;
    
    Node(){
    	this.connections=new ArrayList<Edge>();
    }
    
    Node(String name, List<Edge> connections){
    	this.name=name;
    	this.connections=connections;
    }
    
    
}