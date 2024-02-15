import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chia: ");
        int soChia = scanner.nextInt();

        System.out.print("Nhập số bi chia: ");
        int soBiChia = scanner.nextInt();

        try {
            int ketQua = XuLyPhepChia.thucHienPhepChia(soChia, soBiChia);
            System.out.println("Kết quả phép chia là: " + ketQua);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
