import java.util.*;

class QuickSort {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of strings: ");
        int n = scan.nextInt();

        String array[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the string " + (i + 1) + ": ");
            array[i] = scan.next();
        }

        scan.close();

        QuickSort quicksort = new QuickSort();
        quicksort.qSort(array, 0, (n - 1));

        System.out.println("\nSORTED ARRAY");
        printArray(array);
    }

    public int partition(String array[], int low, int high) {
        String pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (array[j].compareTo(pivot) < 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public void qSort(String array[], int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);
            qSort(array, low, pi - 1);
            qSort(array, pi + 1, high);

        }
    }

    static void printArray(String array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}