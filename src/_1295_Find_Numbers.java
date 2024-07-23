public class _1295_Find_Numbers {
    public static int findNumbers(int[] nums) {
        int bienDem = 0;
        for(int a : nums){
            if (tinhSoChuSo(a) % 2 == 0){
                bienDem++;
            }
        }
        return bienDem;
    }

    private static int tinhSoChuSo(int a) {
        int bienDem = 0;
        int kq = a;

        while (kq != 0){
            kq = a/10;
            a = kq;
            bienDem++;
        }

        return bienDem;
    }


    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
