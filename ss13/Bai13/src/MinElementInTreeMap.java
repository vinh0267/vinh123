import java.util.TreeMap;

public class MinElementInTreeMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo một đối tượng TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Bước 2: Đưa các phần tử vào TreeMap
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");

        // Bước 3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry()
        if (!treeMap.isEmpty()) {
            // Kiểm tra xem TreeMap có rỗng hay không
            System.out.println("Phần tử nhỏ nhất trong TreeMap:");
            System.out.println(treeMap.firstEntry().getKey() + ": " + treeMap.firstEntry().getValue());
        } else {
            System.out.println("TreeMap rỗng.");
        }
    }
}
