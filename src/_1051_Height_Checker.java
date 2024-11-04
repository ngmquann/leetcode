public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];

        System.arraycopy(heights, 0, sorted, 0, heights.length);

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int tmp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < sorted.length; i++) {
            if(heights[i] != sorted[i]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
