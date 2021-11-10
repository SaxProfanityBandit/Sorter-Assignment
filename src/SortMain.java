public class SortMain {
    public static void main(String[] args) {
        int arr[] = { 19, 9, 1, 8, 4, 3 };
        arr = Sorter.heapSort(arr);

        for(int n : arr) {
            System.out.println(n);
        }
    }
}
