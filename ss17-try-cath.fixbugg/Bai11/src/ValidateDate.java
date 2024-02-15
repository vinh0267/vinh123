import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Nhập vào ngày, tháng, năm từ người dùng
            System.out.print("Nhập ngày: ");
            int day = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int month = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();

            // Bước 2: Kiểm tra tính hợp lệ của ngày tháng năm
            validateDate(day, month, year);

            // Bước 3: Nếu hợp lệ, hiển thị thông báo
            System.out.println("Ngày tháng năm hợp lệ");
        } catch (Exception e) {
            // Bước 4: Nếu không hợp lệ, xử lý ngoại lệ và hiển thị thông báo lỗi
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Phương thức kiểm tra tính hợp lệ của ngày tháng năm
    private static void validateDate(int day, int month, int year) throws Exception {
        // Kiểm tra năm
        if (year <= 0) {
            throw new Exception("Năm không hợp lệ");
        }

        // Kiểm tra tháng
        if (month < 1 || month > 12) {
            throw new Exception("Tháng không hợp lệ");
        }

        // Kiểm tra số ngày trong tháng
        int maxDays = getMaxDaysInMonth(month, year);
        if (day < 1 || day > maxDays) {
            throw new Exception("Ngày không hợp lệ");
        }
    }

    // Phương thức để lấy số ngày tối đa trong một tháng
    private static int getMaxDaysInMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default:
                return -1; // Trả về -1 nếu tháng không hợp lệ
        }
    }
}
