package learn.Graph;

import java.util.HashSet;
import java.util.Set;

public class DFS_Recursion {
    public static void DFS(int u, int[][] graph, Set<Integer> visited) {
        System.out.print(u + " ");

        for(int v = graph.length - 1; v >= 0; v--) {
            if(graph[u][v] == 1 && !visited.contains(v)) {
                visited.add(v);
                DFS(v, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0},
        };

        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        DFS(0, graph, visited);
    }
}
