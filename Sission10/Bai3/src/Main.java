import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách chứa các số nguyên
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(3);

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(list, Collections.reverseOrder());

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp theo thứ tự giảm dần:");
        for (int number : list) {
            System.out.println(list);
        }
    }
}