
package kirannew;

import java.util.*;

public class DFS {

    // Graph class to represent the graph using an adjacency list
    static class Graph {
        private int vertices; // Number of vertices in the graph
        private LinkedList<Integer>[] adjacencyList; // Adjacency list representation

        // Constructor
        Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];

            // Initialize the adjacency lists for each vertex
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // Method to add an edge to the graph (from u to v)
        void addEdge(int u, int v) {
            adjacencyList[u].add(v);
        }

        // DFS traversal starting from the given vertex
        void dfs(int startVertex) {
            boolean[] visited = new boolean[vertices]; // To keep track of visited nodes

            // Call the recursive helper function to perform DFS
            dfsRecursive(startVertex, visited);
        }

        // Recursive DFS function
        private void dfsRecursive(int vertex, boolean[] visited) {
            // Mark the current vertex as visited
            visited[vertex] = true;
            System.out.print(vertex + " "); // Print the vertex as we visit it

            // Recur for all adjacent vertices that haven't been visited yet
            for (int adjacentVertex : adjacencyList[vertex]) {
                if (!visited[adjacentVertex]) {
                    dfsRecursive(adjacentVertex, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 6 vertices (0 to 5)
        Graph graph = new Graph(6);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        // Perform DFS starting from vertex 0
        System.out.println("DFS traversal starting from vertex 0:");
        graph.dfs(0);
    }
}

