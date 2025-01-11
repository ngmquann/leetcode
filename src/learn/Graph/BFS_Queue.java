package learn.Graph;

import java.util.*;

public class BFS_Queue {
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

//        Khai bao
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

//        Khoi tao
        queue.add(0);
        visited.add(0);

//        Duyet theo queue
        while(!queue.isEmpty()) {
            int u = queue.poll();
//            Process u
            System.out.print(u + " ");

//            Add tat ca cac dinh ke voi u ma chua duoc duyet vao queue
            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !visited.contains(v)) {
                    queue.add(v);
//                    Danh dau da duyet
                    visited.add(v);
                }
            }
        }
    }
}
