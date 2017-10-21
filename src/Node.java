import java.util.List;

public class Node {
    public String name;
    public List<Edge> connections;
    
    Node(){
    }
    
    Node(String name, List<Edge> connections){
    	this.name=name;
    	this.connections=connections;
    }
}