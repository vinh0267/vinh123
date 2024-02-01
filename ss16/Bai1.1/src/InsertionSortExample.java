public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng ban đầu:");
        displayArr(arr);

        insertionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        displayArr(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {       //  i bắt đầu chạy từ phần tử t2
            int key = arr[i];               // gán phần tử hiện tại cho key
            int j = i - 1;                  // j bằng phần tử trước đó

            while (j >= 0 && arr[j] > key) { // j >= 0 tức là j vẫn phải nằm trong for. j <0 thì i là phần tử đầu tiên nên k cần sắp xếp
                                             // arr[j] > key : phần tử trước lớn hơn phần tử sau thì mới tiến hành sắp xêp
                arr[j + 1] = arr[j];         // đổi  chỗ
                j = j - 1;                   // j dịch lại thêm lần nữa để so sánh.thỏa mãn 2 dk while thì đổi chỗ.nếu không thì chạy xuống dưới
            }
            arr[j + 1] = key;                 // nếu phần tử đằng trước k lớn hơn phía sau thì tức là 2 th bằng nhau hoặc sau lớn hơn thì gán phần tử hiện tại cho chính nó.tài vì j = i-1
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
