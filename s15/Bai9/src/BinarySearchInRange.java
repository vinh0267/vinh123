import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInRange {
    public static void main(String[] args) {
        //  Tạo mảng số nguyên đã sắp xếp
        Integer[] arr = getArr();

        //  Lấy giá trị min và max từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();

        // Tìm kiếm nhị phân và in ra kết quả
        int startIndex = binarySearch(arr, min, true);
        int endIndex = binarySearch(arr, max, false);

        //  In ra số lượng số tìm thấy và chi tiết số đó
        int count = endIndex - startIndex + 1;
        System.out.println("Số lượng số trong khoảng từ " + min + " đến " + max + " là: " + count);
        if (count > 0) {
            System.out.println("Các số trong khoảng từ " + min + " đến " + max + " là:");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Không có số nào trong khoảng từ " + min + " đến " + max + ".");
        }
    }

    // Hàm tạo mảng số nguyên đã sắp xếp
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(Integer[] arr, int target, boolean findClosest) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy chính xác
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid; // Lưu lại vị trí nếu không tìm thấy chính xác
            }
        }

        if (findClosest && result != -1) {
            return result; // Trả về vị trí gần nhất nếu cần tìm chính xác
        } else {
            return -1; // Trả về -1 nếu không tìm thấy
        }
    }
}
