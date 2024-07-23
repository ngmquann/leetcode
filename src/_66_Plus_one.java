public class _66_Plus_one {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9,9};
        int[] arr = plusOne(nums);

        for(int i : arr){
            System.out.println(i);
        }
    }
}
