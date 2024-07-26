public class _1299_Replace_Elements_with_Greatest_Element {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
                arr[i] = -1;
                return arr;
            }
            int max = arr[i+1];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }

    public static void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; ) {
            if(cnt == nums.length-1) break;
            cnt++;
            if(nums[i] == 0){
                int tmp = i;
                for (int j = i+1; j < nums.length; j++) {
                    nums[tmp] = nums[j];
                    tmp++;
                }
                nums[nums.length-1] = 0;
            }
            else{
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1};
//        replaceElements(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        moveZeroes(arr);
    }
}
