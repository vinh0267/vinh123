import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5};

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer item : arr) {
            if (hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item) + 1);
            } else {
                hashMap.put(item, 1);
            }
        }


        int[] newArr = new int[hashMap.size()]; //khởi tạo độ dài luôn cho mảng
        int index = 0;

        //tìm và lưu
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                newArr[index++] = entry.getKey();
            }
        }

        System.out.println("Phần tử chỉ tồn tại duy nhất trong mảng là : ");
        for (int i = 0; i < index; i++) {
            System.out.println(newArr[i]);
        }
    }
}
