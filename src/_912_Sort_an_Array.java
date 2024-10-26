import java.util.Arrays;

public class _912_Sort_an_Array {
    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length + a2.length;
        int[] res = new int[n];
        int i = 0, i1 = 0, i2 = 0;

        while (i < n){
            if (i1 < a1.length && i2 < a2.length){
                if (a1[i1] <= a2[i2]){
                    res[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length){
                    res[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return res;
    }

    public static int[] mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return new int[]{nums[l]};
        }

        int mid = (l + r) / 2;
        int[] a1 = mergeSort(nums, l, mid);
        int[] a2 = mergeSort(nums, mid + 1, r);

        int[] res = merge(a1, a2);
        return res;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};

        int[] a1 = {1,2,3,4};
        int[] a2 = {7,8,9,10};

        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
