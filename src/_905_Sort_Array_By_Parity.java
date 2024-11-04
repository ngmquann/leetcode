public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 != 0) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {0};
        sortArrayByParity(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
