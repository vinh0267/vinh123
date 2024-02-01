import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        // Tạo mảng số nguyên (đã sắp xếp tăng dần)
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};

        //  Lấy số cần tìm từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm nhị phân và in ra kết quả
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
}

