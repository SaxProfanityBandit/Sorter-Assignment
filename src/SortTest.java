public class SortTest {
    public static void main(String[] args) {
        //Testing Class. Defaults to else behavior if no args entered from the commandline.
        if (args.length > 0) {
            int[] unsorted = new int[args.length];
            System.out.println("");
            for(int i = 0; i < args.length; i++) {
                unsorted[i] = Integer.parseInt(args[i]);
            }
            int[] sorted = Sorter.heapSort(unsorted);
            printArray(sorted);
        }
        else {
            int[] arr1 = {-10, 3, 4, 10, -6, 9, 11, -13};
            int[] arr2 = {0, 9, 153, 88, -63, 111, 2, 34};
            int[] arr3 = {1000, 0, 48, -1, 546, 89, 534, -1000};
            int[] arr4 = {8, 7, 6, 5, 4, 3, 2, 1};
            int[] arr5 = {-1, -2, -3, -4, -5, -6, -7, -8};

            //Sorting and printing the test arrays above.
            int[] sorted = new int[arr1.length];
            sorted = Sorter.heapSort(arr1);
            printArray(sorted);
            sorted = Sorter.heapSort(arr2);
            printArray(sorted);
            sorted = Sorter.heapSort(arr3);
            printArray(sorted);
            sorted = Sorter.heapSort(arr4);
            printArray(sorted);
            sorted = Sorter.heapSort(arr5);
            printArray(sorted);
        }
    }

    private static void printArray(int[] arr) {
        //Same line print method with values seperated with commas, but \n between arrays/calls of this method.
        System.out.println("");
        for (int n = 0; n < arr.length; n++) {
            if (n == arr.length-1) {
                System.out.print(arr[n]);
            }
            else {
                System.out.print(arr[n] + ", ");
            }
            
        }
    }
}
