import java.util.HashMap;

public class CheckElementInHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap với các phần tử bên trong
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);
        hashMap.put("cherry", 1);

        // Bước 2: Kiểm tra xem một phần tử có tồn tại trong HashMap hay không
        String elementToCheck = "orange";
        if (hashMap.containsKey(elementToCheck)) {
            System.out.println("Phần tử '" + elementToCheck + "' tồn tại trong HashMap.");
        } else {
            System.out.println("Phần tử '" + elementToCheck + "' không tồn tại trong HashMap.");
        }
    }
}
