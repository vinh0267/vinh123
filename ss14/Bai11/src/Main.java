import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập chuỗi ngày từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày (yyyy-MM-dd): ");
        String inputDate = scanner.next();

        // Sử dụng DateTimeFormatter để chuyển đổi chuỗi ngày thành LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(inputDate, formatter);

        // In ra kết quả
        System.out.println("Đối tượng LocalDate từ chuỗi ngày: " + localDate);
    }
}
