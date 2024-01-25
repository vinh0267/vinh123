import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Bước 2: Thêm phần tử vào danh sách
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(1);
        numberList.add(3);

        // Bước 3: Sắp xếp danh sách bằng thuật toán sắp xếp chọn
        selectionSort(numberList);

        // Bước 4: In danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp: " + numberList);
    }

    // Phương thức thực hiện sắp xếp chọn
    public static void selectionSort(List<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử tại vị trí i với phần tử tại vị trí minIndex
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
