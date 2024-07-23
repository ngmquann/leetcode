public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            if (nums[i] == target) {
                return index;
            }
            else if (nums[i] > target) {
                return index--;
            }
        }

        return ++index;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
}
