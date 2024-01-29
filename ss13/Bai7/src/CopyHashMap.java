import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap gốc và tạo dữ liệu
        HashMap<String, Integer> originalHashMap = new HashMap<>();
        originalHashMap.put("apple", 5);
        originalHashMap.put("banana", 2);
        originalHashMap.put("orange", 8);
        originalHashMap.put("grape", 3);
        originalHashMap.put("cherry", 1);

        // Bước 2: Khai báo một HashMap mới và sao chép tất cả các phần tử từ HashMap gốc
        HashMap<String, Integer> copiedHashMap = new HashMap<>();
        copiedHashMap.putAll(originalHashMap);

        // Bước 3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
        System.out.println("HashMap gốc:");
        System.out.println(originalHashMap);

        System.out.println("HashMap mới sau khi sao chép:");
        System.out.println(copiedHashMap);
    }
}
