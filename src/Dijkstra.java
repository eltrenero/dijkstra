//import java.util.List;
//
//public class Dijkstra {
//public static void main(String args[]) {
////	int[] daro= {1,2,3,4,5};
////	for(int i:daro) {
////	System.out.println(i);
////	}
//	
//	Edge E1=new Edge();
//	Node A = new Node();
//	Node B = new Node();
//	Node C = new Node();
//	Node D = new Node();
//	Node E = new Node();
//	Graph G = new Graph();
//	A.connections.add(E1);
//	E1.start=A;
//	A.name="A";
//	E1.end=B;
//	B.name="B";
//	E1.weight=3;
//	G.nodes.add(A);
//	G.nodes.add(B);
//	G.nodes.add(C);
//	G.nodes.add(D);
//	G.nodes.add(E);
//	System.out.println(E1.start.name);
//	System.out.println(E1.end.name);
//	System.out.println(E1.weight);
//	System.out.println("ok");
//}
//
//
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;;
public class Dijkstra {
 public static void main(String[] args) throws ClientProtocolException, IOException {
  HttpClient client = new DefaultHttpClient();
  HttpGet request = new HttpGet("http://api.fixer.io/2017-10-22");
  HttpResponse response = client.execute(request);
  BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
  String line = "";
  while ((line = rd.readLine()) != null) {
    System.out.println(line);
  }
 }
}
