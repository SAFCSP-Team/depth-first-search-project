import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class Vertex {

        char data;

        public Vertex(char data) {
            this.data = data;
        }
}

public class Graph {

    public ArrayList<LinkedList<Vertex>> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        LinkedList<Vertex> list = new LinkedList<>();
        list.add(v);
        vertices.add(list);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Vertex> list = vertices.get(src); // get the list of vertices at index src
        Vertex dstVertex = vertices.get(dst).get(0); // get the vertex at index dst
        list.add(dstVertex); // add the vertex to the list
    }

    public void depthFirstSearch(int StartVerIndx) {

     /* Add your code here */ 

}

     public int getVertexIndex(char data) {

     /* Add your code here */ 

}


    public static void main(String[] args) {

     /* Add your code here */ 


}



}
