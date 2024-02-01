import java.util.Scanner;

public class BinarySearchExample {
    private static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        double[] arr = {0.5, 1.2, 2.3, 3.7, 4.9, 6.1, 7.5, 8.8, 9.9, 10.4};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        double target = scanner.nextDouble();

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        }
    }
}