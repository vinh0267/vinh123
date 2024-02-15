import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double banKinh = nhapBanKinh("Nhập bán kính hình tròn: ");

        double dienTich = tinhDienTichHinhTron(banKinh);
        System.out.println("Diện tích hình tròn là: " + dienTich);

        scanner.close();
    }

    private static double nhapBanKinh(String message) {
        Scanner scanner = new Scanner(System.in);
        double banKinh = 0;
        boolean nhapDung = false;

        do {
            try {
                System.out.print(message);
                banKinh = scanner.nextDouble();
                if (banKinh < 0) {
                    throw new IllegalArgumentException();
                }
                nhapDung = true;
            } catch (InputMismatchException e) { //đầu vào được cung cấp không khớp với loại dự kiến
                System.out.println("Lỗi: Vui lòng nhập một số. Thử lại.");
                scanner.nextLine(); // Đọc bỏ dòng nhập lỗi để tránh lặp vô hạn

            } catch (IllegalArgumentException e) { // đối số không hợp lệ hoặc không phù hợp
                System.out.println("Lỗi: Bán kính không thể là số âm. Thử lại.");
                scanner.nextLine();
            }
        } while (!nhapDung);

        return banKinh;
    }

    private static double tinhDienTichHinhTron(double banKinh) {
        return Math.PI * banKinh * banKinh;
    }
}
