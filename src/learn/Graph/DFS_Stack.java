package learn.Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS_Stack {
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
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

//        Khoi tao
        stack.push(0);
        visited.add(0);

//        Duyet theo stack
        while(!stack.isEmpty()) {
            int u = stack.pop();
//            Process u
            System.out.print(u + " ");

//            Add tat ca cac dinh ke voi u ma chua duoc duyet vao stack
            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !visited.contains(v)) {
                    stack.push(v);
//                    Danh dau da duyet
                    visited.add(v);
                }
            }
        }
    }
}
