import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class TriangleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào 3 cạnh của tam giác
            System.out.print("Nhập cạnh a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập cạnh b: ");
            int b = scanner.nextInt();

            System.out.print("Nhập cạnh c: ");
            int c = scanner.nextInt();

            // Kiểm tra và sinh ngoại lệ nếu cạnh tam giác không hợp lệ
            validateTriangleSides(a, b, c);

            // In kết quả nếu không có ngoại lệ
            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
        } catch (IllegalTriangleException e) {
            // Xử lý ngoại lệ và hiển thị thông báo lỗi
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception ex) {
            // Xử lý các ngoại lệ khác nếu có
            System.out.println("Lỗi không xác định: " + ex.getMessage());
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để kiểm tra tam giác và sinh ngoại lệ nếu cạnh không hợp lệ
    private static void validateTriangleSides(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Ba cạnh không tạo thành tam giác hợp lệ.");
        }
    }
}
