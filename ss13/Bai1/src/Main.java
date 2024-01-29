import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);


        HashMap<Integer, Integer> hasmap = new HashMap<>();//khởi tạo hasmap vs cặp key value là Integer


        for (Integer item : list) { // duyệt qua list
            if (hasmap.containsKey(item)) { //  nếu hasmap có tồn tại
                hasmap.put(item, hasmap.get(item) + 1); // tăng value lên 1
            } else { // nếu chưa có
                hasmap.put(item, 1); // put giá trị vào với value là 1
            }
        }

        for (Map.Entry<Integer, Integer> entry : hasmap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
}
