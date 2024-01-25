import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Đảo ngược mảng
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(9);

        List<Integer> newList = new ArrayList<>();

        // Duyệt ngược từ cuối danh sách đến đầu danh sách
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }

        System.out.println("Danh sách gốc: " + list);
        System.out.println("Danh sách đảo ngược: " + newList);
    }
}
