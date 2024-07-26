public class _7_Reverse_Integer {
    public static int reverse(int x) {
        int result = 0, prev_rev_num = 0;
        while (x != 0) {
            int curr_digit = x % 10;
            result = result * 10 + curr_digit;
            if ((result - curr_digit)/10 != prev_rev_num)
            {
                return 0;
            }
            prev_rev_num = result;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
