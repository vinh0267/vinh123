import java.util.*;

public class RemoveElementFromTreeMap {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo TreeMap và thêm các phần tử
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");

        // Bước 2: In ra TreeMap để kiểm tra
        System.out.println("TreeMap ban đầu:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Bước 3: Thực hiện xóa bằng phương thức remove()
        int keyToRemove = 3;
        treeMap.remove(keyToRemove);

        // Bước 4: In ra TreeMap sau khi xóa để kiểm tra
        System.out.println("\nTreeMap sau khi xóa phần tử có key = " + keyToRemove + ":");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
