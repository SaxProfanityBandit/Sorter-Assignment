public class SortTest {
    public static void main(String[] args) {
        //Testing Class.
        int[] arr1 = {-10, 3, 4, 10, -6, 9, 11, -13};
        int[] arr2 = {0, 9, 153, 88, -63, 111, 2, 34};
        int[] arr3 = {1000, 0, 48, -1, 546, 89, 534, -1000};
        int[] arr4 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr5 = {-8, -7, -6, -5, -4, -3, -2, -1};
    
        printArray(arr1);
        //int[] sorted = new int[arr1.length];
        Sorter.heapSort(arr1);
        printArray(arr1);
        //sorted = Sorter.heapSort(arr2);
        //printArray(sorted);
        //sorted = Sorter.heapSort(arr3);
        //printArray(sorted);
        //sorted = Sorter.heapSort(arr4);
        //printArray(sorted);
        //sorted = Sorter.heapSort(arr5);
        //printArray(sorted);
    }

    private static void printArray(int[] arr) {
        System.out.println("");
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
    }
}
