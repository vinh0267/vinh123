import java.util.ArrayList;
import java.util.List;

public class SumList {
    public static void main(String[] args) {
        // Bước 1: Tạo danh sách các số nguyên
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        // Bước 2: Khai báo biến tổng và khởi tạo bằng 0
        int sum = 0;

        // Bước 3: Sử dụng phương thức forEach để tính tổng các phần tử trong danh sách
        for (int number : numberList) {
            sum += number;
        }

        // Bước 4: In tổng các phần tử trong danh sách
        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }
}
