# Depth first search project  
  

## Objective

In this project, we will cover the fundamentals of a Depth first search, and how to implement it using a Linked list.


## Problem


Create `depthFirstSearch` function to perform a Depth-first traversal for the below `graph` of character vertices :  

B -> A  
A -> C -> D -> E  
C -> B  
D -> F  
E -> F  

## Implementation

`Graph` class:   
- Create a `depthFirstSearch()` function using the below properties:
  - Array to keep track of the visited vertices.  
  - Stack to store and print the untraveled vertices indexes (not visited).

- Create `getVertexIndex()` function:  
  - This function should receive the vertex data and return the vertex index.  

`main` function:   
- Create the `Graph` in Figure 1 using the below functions:    
  - call `addVertex(Vertex v)` to add the verteces.  
  - call `addEdge(int src, int dst)` to connect the verteces.  
  - call `depthFirstSearch(int startIndex)` and pass `0` as parameter.
 
`Output`:  
  
  ```
  B A E F D C
  ```

`Vertex` class  

```java

class Vertex {

        char data;

        public Vertex(char data) {
            this.data = data;
        }
}

```

`Graph` class  

```java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class Graph {

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
```


