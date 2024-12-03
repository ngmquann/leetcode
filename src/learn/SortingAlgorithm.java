package learn;

public class SortingAlgorithm {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            boolean isSorted = true;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            printArray(arr);
            if(isSorted) break;
            System.out.println();
        }

    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            printArray(arr);
            System.out.println();
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int ai = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > ai){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = ai;
            printArray(arr);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        insertionSort(arr);
    }
}
