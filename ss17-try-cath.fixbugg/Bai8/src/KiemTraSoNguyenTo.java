import java.util.InputMismatchException;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soCanKiemTra = nhapSoNguyen("Nhập một số cần kiểm tra: ");

        if (soCanKiemTra < 2) {
            System.out.println("Lỗi: Số phải lớn hơn hoặc bằng 2.");
        } else {
            boolean laSoNguyenTo = kiemTraSoNguyenTo(soCanKiemTra);
            hienThiKetQua(soCanKiemTra, laSoNguyenTo);
        }

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

    private static boolean kiemTraSoNguyenTo(int so) {
        if (so == 2) {
            return true;
        }

        if (so % 2 == 0 || so == 1) {
            return false;
        }

        int canBacHai = (int) Math.sqrt(so);
        for (int i = 3; i <= canBacHai; i += 2) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void hienThiKetQua(int soCanKiemTra, boolean laSoNguyenTo) {
        if (laSoNguyenTo) {
            System.out.println(soCanKiemTra + " là số nguyên tố.");
        } else {
            System.out.println(soCanKiemTra + " không là số nguyên tố.");
        }
    }
}
