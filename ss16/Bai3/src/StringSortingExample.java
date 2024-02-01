import java.util.Arrays;

public class StringSortingExample {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        System.out.println("Mảng ban đầu:");
        displayArray(arr);

        // Sắp xếp bằng Insertion Sort
        insertionSort(arr.clone());

        // Sắp xếp bằng Selection Sort
        selectionSort(arr.clone());

        // Sắp xếp bằng Arrays.sort
        arraysSort(arr.clone());
    }

    private static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            System.out.println("\nMảng sau khi sắp xếp bằng Insertion Sort:");
            displayArray(arr);
        }
    }

    private static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println("\nMảng sau khi sắp xếp bằng Selection Sort:");
            displayArray(arr);
        }
    }

    private static void arraysSort(String[] arr) {
        Arrays.sort(arr);

        System.out.println("\nMảng sau khi sắp xếp bằng Arrays.sort:");
        displayArray(arr);
    }

    private static void displayArray(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
