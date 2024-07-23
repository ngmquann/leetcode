public class _26_Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j < length; ) {
                if (nums[i] == nums[j]) {
                    for (int k = j; k < length; k++) {
                        nums[k-1] = nums[k];
                    }
                    length--;
                }
                else{
                    j++;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
