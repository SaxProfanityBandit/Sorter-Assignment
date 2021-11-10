import javax.swing.JOptionPane;
public class SortMain {
    public static void main(String[] args) {
        //Input from String into Int, using Swing.
        String numbersString = JOptionPane.showInputDialog(null, "Enter the numbers you want sorted, seperate them with commas.");
        
        //Splitting the input string and parsing into int
        String[] unsortedString = numbersString.split(",");
        int[] unsorted = new int[unsortedString.length];
        for (int i = 0; i < unsortedString.length; i++) {
            unsorted[i] = Integer.parseInt(unsortedString[i]);
        }

        //Sorting the input numbers and storing in a new array.
        int[] sorted = new int[unsorted.length];
        sorted = Sorter.heapSort(unsorted);

        //Print out the sorted array.
        for(int n : sorted) {
            System.out.println(n);
        }
    }
}
