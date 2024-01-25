import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinElement {
    public static void main(String[] args) {
        // Bước 1: Tạo danh sách các số nguyên
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(1);
        numberList.add(3);

        // Bước 2: Sử dụng phương thức Collections.min() để tìm số nhỏ nhất trong danh sách
        int minValue = Collections.min(numberList);

        // Bước 3: In số nhỏ nhất
        System.out.println("Số nhỏ nhất trong danh sách: " + minValue);
    }
}
