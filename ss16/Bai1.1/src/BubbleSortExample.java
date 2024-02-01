public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng ban đầu:");
        displayArr(arr);
        bubbleSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        displayArr(arr);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {  //
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {   // nếu phần tử hiện tại lớn hơn phần tử ngay sau
                    int temp = arr[j];      // gán phần tử hiện tại cho temp
                    arr[j] = arr[j + 1];    //gán phần từ sau cho phần tử hiện tại
                    arr[j + 1] = temp;      // gán temp cho phần tử ngay sau . nhắm mục đích đổi chỗ.
                }
            }
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
