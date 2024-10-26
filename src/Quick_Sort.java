import java.util.Arrays;

public class Quick_Sort {
    public static int[] quickSort(int[] arr, int left, int right) {
        if(left >= right) return new int[]{arr[left]};

        int key = arr[(left + right)/2];

        int k = partition(arr, left, right, key);

        quickSort(arr, left, k-1);
        quickSort(arr, k, right);

        return arr;
    }

    public static int partition(int[] arr, int left, int right, int key) {
        int iL = left;
        int iR = right;

        while(iL < iR) {
            while(arr[iL] < key) iL++;
            while(arr[iR] > key) iR--;

            if(iL <= iR){
                int temp = arr[iL];
                arr[iL] = arr[iR];
                arr[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{2,5,6,2,532,9,68,7,5}, 0, 8)));
    }
}
