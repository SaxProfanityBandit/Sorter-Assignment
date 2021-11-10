public class Sorter {

    //As using the built in sort in Java is a bit too easy, writing heapsort in java instead.
    //Had to rewrite it with a more complex one than originally planned due to not handling negative values correctly.
    public static int[] heapSort(int[] unsorted)
    {
        int[] arr = unsorted;
        int n = arr.length-1;
        buildheap(arr, n);

        for(int i = n; i > 0; i--) {
            exchange(arr, 0, i);
            n = n - 1;
            heapify(arr, n, 0);
        }
        return arr;
    }

    private static void buildheap(int [] arr, int n) {
        for(int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int arr[], int n, int i) {
        
        //Defining largest by the loop from above and what part is left and right of the heap.
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //Is left larger than root?
        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }
        else {
            largest = i;
        }

        //Is right larger than root/largest so far?
        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        //Is largest not root of the heap/tree? 
        if (largest != i) {
            exchange(arr, i, largest);
            //Recursive heapify.
            heapify(arr, n, largest);
        }
    }

    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
