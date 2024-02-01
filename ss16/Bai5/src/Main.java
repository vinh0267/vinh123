public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng ban đầu là:");
        displayArr(arr);

        // Sắp xếp bằng Insertion Sort
        insertionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp giảm dần là:");
        displayArr(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void displayArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
