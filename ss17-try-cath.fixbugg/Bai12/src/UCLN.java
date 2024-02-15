import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Khai báo biến và nhập dữ liệu
            System.out.print("Nhập số thứ nhất: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int num2 = scanner.nextInt();

            // Bước 2: Kiểm tra điều kiện cả hai số bằng 0
            if (num1 == 0 && num2 == 0) {
                throw new Exception("Cả hai số đều bằng 0. Không có ước chung lớn nhất.");
            }

            // Bước 3: Tìm ước chung lớn nhất (UCLN)
            int ucln = findUCLN(num1, num2);

            // Bước 4: Hiển thị kết quả
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + ucln);
        } catch (Exception e) {
            // Bước 5: Hiển thị thông báo lỗi nếu có
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Bước 6: Kết thúc chương trình và đóng Scanner
            scanner.close();
        }
    }

    // Phương thức để tìm ước chung lớn nhất của hai số nguyên
    private static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Trả về giá trị tuyệt đối của a
    }
}
