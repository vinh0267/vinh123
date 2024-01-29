import java.util.Arrays;
import java.util.TreeMap;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo một mảng các số nguyên
        int[] intArray = {5, 2, 8, 3, 1};

        // Bước 2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap
        for (int element : intArray) {
            treeMap.put(element, 0);
        }

        // Bước 4: Lấy giá trị của phần tử lớn nhất trong TreeMap
        int largestElement = treeMap.lastKey();

        // Bước 5: Xóa phần tử lớn nhất khỏi TreeMap
        treeMap.remove(largestElement);

        // Bước 6: Lấy giá trị của phần tử lớn thứ hai trong mảng ban đầu
        int secondLargestElement = treeMap.lastKey();

        // In kết quả
        System.out.println("Mảng ban đầu: " + Arrays.toString(intArray));
        System.out.println("Phần tử lớn thứ hai trong mảng: " + secondLargestElement);
    }
}
