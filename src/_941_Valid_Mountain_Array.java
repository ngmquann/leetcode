import java.util.Arrays;

public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int n = arr.length;
        int i = 0, j = n - 1;

        while (arr[i] < arr[i+1] && i < n -2) {
            i++;
            if(i == n) return false;
        }

        while (arr[j] < arr[j-1] && j > 0) {
            j--;
            if(j == 0) return false;
        }

        return i==j;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }
}
