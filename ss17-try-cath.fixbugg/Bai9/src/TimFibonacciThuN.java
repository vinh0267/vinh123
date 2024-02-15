import java.util.InputMismatchException;
import java.util.Scanner;

public class TimFibonacciThuN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = nhapSoNguyenDuong("Nhập số Fibonacci thứ n: ");

        if (n <= 0) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên dương.");
        } else {
            int ketQua = tinhFibonacci(n);
            System.out.println("Số Fibonacci thứ " + n + " là: " + ketQua);
        }

        scanner.close();
    }

    private static int nhapSoNguyenDuong(String message) {
        Scanner scanner = new Scanner(System.in);
        int so = 0;
        boolean nhapDung = false;

        do {
            try {
                System.out.print(message);
                so = scanner.nextInt();
                nhapDung = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên dương. Thử lại.");
                scanner.nextLine();
            }
        } while (!nhapDung);

        return so;
    }

    private static int tinhFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibo1 = 0, fibo2 = 1, fibo = 0;
        for (int i = 2; i <= n; i++) {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
        }

        return fibo;
    }
}
