public class _200_Number_of_Islands {
    static boolean[][] visited = new boolean[300][300];
    static int soHang;
    static int soCot;

    public static boolean isValid(int i, int j) {
        return i >= 0 && i < soHang && j >= 0 && j < soCot;
    }

    public static void DFS(char[][] grid, int i, int j) {
        if(!isValid(i, j)) return;
        if(grid[i][j] == '0' || visited[i][j]) return;

        visited[i][j] = true;

        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        soHang = grid.length;
        soCot = grid[0].length;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    DFS(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }
}
