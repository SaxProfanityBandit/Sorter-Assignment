public class Sorter {

    //As using the built in sort in Java is a bit too easy, writing heapsort in java instead.
    public static int[] heapSort(int[] unsorted) throws Exception {
        int[] sorted = new int[unsorted.length];
        for (int i = (unsorted.length / 2 - 1); i > 0; i--) {
            heapify(unsorted, unsorted.length, i);
        }
        return sorted;
    }

    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
    }

    //private siftDown

    

}
