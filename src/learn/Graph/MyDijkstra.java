package learn.Graph;

import java.util.HashSet;
import java.util.Set;

public class MyDijkstra {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = {
                {0, 6, 0, 1, 0},
                {6, 0, 5, 2, 2},
                {0, 5, 0, 0, 5},
                {1, 2, 0, 0, 1},
                {0, 2, 5, 1, 0}
        };
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];
        int[] previous = new int[n];
        int start = 0;
        int finish = 4;
        int infinite = Integer.MAX_VALUE;

//        Buoc 1: khoi tao khoang cach
        for (int i = 0; i < n; i++) {
            distance[i] = infinite;
        }
        distance[start] = 0;

        while(visited.size() < n) {
//        Buoc 2: Chon dinh chua duyet va dang co khoang cach nho nhat (tu dinh xuat phat) lam dinh dang xet
            int check = 0;
            int minDistance = infinite;
            for (int i = 0; i < n; i++) {
                if(!visited.contains(i) && distance[i] < minDistance) {
                    minDistance = distance[i];
                    check = i;
                }
            }
//        Buoc 3: tu dinh dang xet, duyet cac dinh ke chua duyet: update khoang cach va dinh trc cua dinh do
            for (int i = 0; i < n; i++) {
                if(!visited.contains(i) && graph[check][i] != 0) {
                    int newDistance = distance[check] + graph[check][i];
                    if (newDistance < distance[i]) {
                        distance[i] = newDistance;
                        previous[i] = check;
                    }
                }
            }

//        Buoc 4: danh dau dinh dang xet thanh dinh da duyet
            visited.add(check);
        }

        System.out.println("Khoang cach nho nhat tu " + start + " den " + finish + ": " + distance[finish]);
        System.out.println("Duong di: ");
        int run = finish;
        while (run != start){
            System.out.print(run + " <- ");
            run = previous[run];
        }
        System.out.print(run);
    }
}
