import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập ngày thứ nhất từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày thứ nhất (yyyy-MM-dd): ");
        String inputDate1 = scanner.next();
        LocalDate date1 = LocalDate.parse(inputDate1);

        // Nhập ngày thứ hai từ người dùng
        System.out.print("Nhập ngày thứ hai (yyyy-MM-dd): ");
        String inputDate2 = scanner.next();
        LocalDate date2 = LocalDate.parse(inputDate2);

        // Tính toán số ngày giữa hai ngày
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // In ra kết quả
        System.out.println("Số ngày giữa " + date1 + " và " + date2 + " là: " + daysBetween + " ngày.");
    }
}
