import java.util.Arrays;
import java.util.TreeMap;

public class SortArrayToTreeMap {
    public static void main(String[] args) {
        // Bước 1: Viết chương trình Java để sắp xếp một mảng các phần tử nguyên theo thứ tự tăng dần
        int[] intArray = {5, 2, 8, 3, 1};
        Arrays.sort(intArray);

        // Bước 2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap
        for (int element : intArray) {
            treeMap.put(element, 0);
        }

        // Bước 4: Kiểm tra kết quả bằng cách in ra các phần tử trong TreeMap
        System.out.println("Các phần tử đã sắp xếp trong TreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}
