import java.util.Arrays;

public class _136_Single_Number {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) return nums[i-1];
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
