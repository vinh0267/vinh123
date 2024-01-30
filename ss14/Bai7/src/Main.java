import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập hai số nguyên x và y từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số nguyên y: ");
        int y = scanner.nextInt();

        // Bước 2: Sử dụng Stream API và range() để tạo danh sách các số từ x đến y
        List<Integer> integerList = IntStream.rangeClosed(x, y)//rangeClosed : tạo ra một luồng (stream) chứa các số nguyên từ x đến y, bao gồm cả x và y.
                .boxed() // chuyển đổi các phần tử trong luồng từ kiểu int sang kiểu Integer,
                .collect(Collectors.toList());

        // In ra danh sách số nguyên
        System.out.println("Danh sách số nguyên từ " + x + " đến " + y + ": " + integerList);
    }
}
