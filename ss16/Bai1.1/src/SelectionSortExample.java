public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng ban đầu:");
        displayArr(arr);
        selectionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        displayArr(arr);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Tìm phần tử nhỏ nhất trong đoạn chưa được sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void displayArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
