public class BubbleSortVisualization {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Mảng ban đầu là:");
        displayArr(arr);

        // Sắp xếp bằng Bubble Sort
        bubbleSortVisualization(arr);

        System.out.println("\nMảng sau khi sắp xếp là:");
        displayArr(arr);
    }

    private static void bubbleSortVisualization(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Display the array after each swap
                    displayArrWithHighlight(arr, j, j + 1);
                }
            }
        }
    }

    private static void displayArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void displayArrWithHighlight(int[] arr, int highlight1, int highlight2) {
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
