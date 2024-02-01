import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchInDescendingArray {
    public static void main(String[] args) {
        //  Tạo mảng số nguyên giảm dần
        Integer[] arr = getArr();

        // In ra mảng số nguyên
        System.out.println("Mảng số nguyên giảm dần:");
        printArray(arr);

        // Nhập số nguyên từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm nhị phân và in ra kết quả
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tạo mảng số nguyên giảm dần
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    // Hàm in mảng
    private static void printArray(Integer[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }
}
