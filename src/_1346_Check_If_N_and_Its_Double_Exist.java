public class _1346_Check_If_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1;j < arr.length; j++){
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 14, 0};
        System.out.println(checkIfExist(arr));
    }
}
