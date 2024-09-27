import java.util.Arrays;

public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {1,546,123,54,123,14,14,5,452,3,3423,41,123,11,1,1,13,3,4,13,13};
        System.out.println(majorityElement(nums));
    }
}
