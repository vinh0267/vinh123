import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng số nguyên 100 phần tử ngẫu nhiên từ khoảng 1-1000
        // Sử dụng API để duyệt mảng và phương thức mã() để tìm số lớn nhất

        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(1000) + 1; // Đảm bảo số ngẫu nhiên từ 1 đến 1000

        //duyệt mảng
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = supplier.get();
        }

        // Duyệt mảng và in ra các phần tử
        System.out.println("Mảng số nguyên ngẫu nhiên:");
        System.out.println(Arrays.toString(arr));



        // Sử dụng Stream API để tìm số lớn nhất
        int maxNumber = Arrays.stream(arr).max().orElse(0);

        // In ra số lớn nhất
        System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
    }
}
