public class _414_Third_Maximum_Number {
    public static void insertNum(long[] nums, int val){
        int i = 0;
        while(i < nums.length){
            if(nums[i] == val) {
                return;
            }
            else if(val > nums[i]){
                break;
            }
            else {
                i++;
            }
        }

        if(i < nums.length){
            for(int j = nums.length - 2; j >= i; j--){
                nums[j + 1] = nums[j];
            }
            nums[i] = val;
        }
    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i = 0; i < nums.length; i++) {
            insertNum(maxArr, nums[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE){
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
