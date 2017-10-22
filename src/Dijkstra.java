import java.util.List;

public class Dijkstra {
public static void main(String args[]) {
//	int[] daro= {1,2,3,4,5};
//	for(int i:daro) {
//	System.out.println(i);
//	}
	
	Edge E1=new Edge();
	Node A = new Node();
	Node B = new Node();
	Node C = new Node();
	Node D = new Node();
	Node E = new Node();
	Graph G = new Graph();
	A.connections.add(E1);
	E1.start=A;
	E1.end=B;
	E1.weight=3;
	G.nodes.add(A);
	G.nodes.add(B);
	G.nodes.add(C);
	G.nodes.add(D);
	G.nodes.add(E);
	System.out.println(E1.start);
	System.out.println(E1.end);
	System.out.println(E1.weight);
	System.out.println("ok");
}


}
