import java.util.Arrays;

public class InsertionSortVisualization {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Mảng ban đầu:");
        displayArray(arr);

        insertionSortVisualization(arr);
    }

    private static void insertionSortVisualization(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("\nBước " + i + ":");
            displayArrayWithHighlight(arr, j + 1, i);

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

                displayArrayWithHighlight(arr, j + 1, i);
            }
            arr[j + 1] = key;
        }

        System.out.println("\nMảng sau khi sắp xếp:");
        displayArray(arr);
    }

    private static void displayArray(int[] arr) {
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    private static void displayArrayWithHighlight(int[] arr, int highlight1, int highlight2) {
        for (int i = 0; i < arr.length; i++) {
            if (i == highlight1 || i == highlight2) {
                System.out.print("[" + arr[i] + "] ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
