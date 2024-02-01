import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {
        // Tạo mảng số nguyên
        int[] arr = {12, 45, 67, 89, 34, 56, 78, 90, 23, 56};

        // Lấy số cần tìm từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm tuyến tính và in ra kết quả
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm tuyến tính
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
}
