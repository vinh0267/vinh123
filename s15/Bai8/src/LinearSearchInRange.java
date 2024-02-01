import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        //  Tạo mảng số nguyên ngẫu nhiên
        int[] arr = getArr();

        // Lấy giá trị min và max từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();

        // Tìm kiếm và in ra kết quả
        List<Integer> foundNumbers = searchInRange(arr, min, max);

        // In ra số lượng số tìm thấy và chi tiết số đó
        System.out.println("Số lượng số trong khoảng từ " + min + " đến " + max + " là: " + foundNumbers.size());
        if (!foundNumbers.isEmpty()) {
            System.out.println("Các số trong khoảng từ " + min + " đến " + max + " là:");
            for (int number : foundNumbers) {
                System.out.print(number + " ");
            }
        } else {
            System.out.println("Không có số nào trong khoảng từ " + min + " đến " + max + ".");
        }
    }

    // Hàm tạo mảng số nguyên ngẫu nhiên
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1; // Từ 1 đến 100
        }
        return arr;
    }

    // Hàm tìm kiếm số trong khoảng min đến max
    private static List<Integer> searchInRange(int[] arr, int min, int max) {
        List<Integer> foundNumbers = new ArrayList<>();
        for (int number : arr) {
            if (number >= min && number <= max) {
                foundNumbers.add(number);
            }
        }
        return foundNumbers;
    }
}
