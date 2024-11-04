import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            isAvailable[nums[i] - 1] = true;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!isAvailable[i]) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        List<Integer> res = findDisappearedNumbers(nums);
        for(Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
