import java.util.InputMismatchException;
import java.util.Scanner;

public class TimSoLonHon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soThuNhat = nhapSoNguyen("Nhập số thứ nhất: ");
        int soThuHai = nhapSoNguyen("Nhập số thứ hai: ");

        int soLonNhat = timSoLonNhat(soThuNhat, soThuHai);

        System.out.println("Số lớn nhất là: " + soLonNhat);

        scanner.close();
    }

    private static int nhapSoNguyen(String message) {
        Scanner scanner = new Scanner(System.in);
        int so = 0;
        boolean nhapDung = false;

        do {
            try {
                System.out.print(message);
                so = scanner.nextInt();
                nhapDung = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên. Thử lại.");
                scanner.nextLine();
            }
        } while (!nhapDung);

        return so;
    }

    private static int timSoLonNhat(int soThuNhat, int soThuHai) {
        return Math.max(soThuNhat, soThuHai);
    }
}
