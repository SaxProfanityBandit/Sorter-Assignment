public class Sorter {

    //As using the built in sort in Java is a bit too easy, writing heapsort in java instead.
    public static int[] heapSort(int[] unsorted) throws Exception {
        int[] sorted = new int[unsorted.length];

        //Create the heap tree and rearrange the array.
        for (int i = (unsorted.length / 2 - 1); i > 0; i--) {
            heapify(unsorted, unsorted.length, i);
        }

        //Extract elements from the heap.
        for (int i = (unsorted.length - 1); i > 0; i--) {
            //Move to end.
            int temp = unsorted[0];
            unsorted[0] = unsorted[i];
            unsorted[i] = temp;

            heapify(unsorted, i, 0);
        }
        sorted = unsorted;
        return sorted;
    }

    private static void heapify(int arr[], int n, int i) {
        
        //Defining largest by the loop from above and what part is left and right of the heap.
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //Is left larger than root?
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        //Is right larger than root/largest so far?
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        //Is largest not root of the heap/tree? 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            //Recursive heapify.
            heapify(arr, n, largest);
        }
    }

    //private siftDown

    

}
