import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Khai báo biến và nhập dữ liệu
            System.out.print("Nhập chuỗi: ");
            String inputString = scanner.nextLine();

            // Bước 2: Kiểm tra điều kiện chuỗi rỗng hoặc null
            if (inputString == null || inputString.isEmpty()) {
                throw new Exception("Chuỗi không hợp lệ. Vui lòng nhập chuỗi khác.");
            }

            // Bước 3: Đảo ngược chuỗi
            String reversedString = reverseString(inputString);

            // Bước 4: Hiển thị kết quả
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        } catch (Exception e) {
            // Bước 5: Hiển thị thông báo lỗi nếu có
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Bước 6: Kết thúc chương trình và đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để đảo ngược chuỗi
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
