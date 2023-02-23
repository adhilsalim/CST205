import java.util.*;

public class qs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of strings: ");
        int n = scan.nextInt();

        String array[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the string " + (i + 1) + ": ");
            array[i] = scan.next();
        }

        scan.close();

        qs q = new qs();
        q.quicksort(array, 0, n - 1);
        q.display(array);
    }

    public int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void quicksort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
