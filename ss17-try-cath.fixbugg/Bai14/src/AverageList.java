import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Khai báo biến và nhập dữ liệu
            System.out.print("Nhập số lượng phần tử của danh sách: ");
            int size = scanner.nextInt();

            // Bước 2: Kiểm tra điều kiện danh sách rỗng
            if (size <= 0) {
                throw new Exception("Số lượng phần tử không hợp lệ. Vui lòng nhập số lượng phần tử lớn hơn 0.");
            }

            // Bước 3: Nhập giá trị cho danh sách
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                list.add(scanner.nextInt());
            }

            // Bước 4: Tính giá trị trung bình
            double average = calculateAverage(list);

            // Bước 5: Hiển thị kết quả
            System.out.println("Giá trị trung bình của danh sách là: " + average);
        } catch (Exception e) {
            // Bước 6: Hiển thị thông báo lỗi nếu có
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Bước 7: Kết thúc chương trình và đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để tính giá trị trung bình của danh sách
    private static double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Danh sách không có phần tử. Không thể tính giá trị trung bình.");
        }

        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return (double) sum / list.size();
    }
}
