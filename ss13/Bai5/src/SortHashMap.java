import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        // Khai báo một HashMap và thêm các phần tử vào đó
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);
        hashMap.put("cherry", 1);

        /* Tạo một danh sách các cặp key-value từ HashMap */
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        //Map.Entry đại diện cho 1 cặp key value

        //  Sắp xếp danh sách các phần tử theo giá trị tăng dần của chúng
        Collections.sort(entryList, Map.Entry.comparingByValue());
        // Duyệt qua danh sách đã sắp xếp và in ra các phần tử và giá trị của chúng theo thứ tự tăng dần
        System.out.println("HashMap sau khi sắp xếp:");

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
