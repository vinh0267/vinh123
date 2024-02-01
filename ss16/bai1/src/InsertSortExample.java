import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class InsertSortExample {
    public static void main(String[] args) {
        List<Integer> randomList = getRandom();

        System.out.println("Danh sách ban đầu là:");
        randomList.forEach(value -> System.out.print(value + "  "));

        System.out.println("\nMảng sau khi sắp xếp bằng Insert Sort là:");
        insertSortList(randomList);
        randomList.forEach(value -> System.out.print(value + "  "));
    }

    private static void insertSortList(List<Integer> randomList) {
        int n = randomList.size();

        for (int i = 1; i < n; i++) {
            int key = randomList.get(i);                      // lấy phần tử vị trí hiện tai gán cho key
            int j = i - 1;                                    // gán i-1 cho j . biến j được sử dụng để di chuyển qua các phần tử lớn hơn key trong phần danh sách đã sắp xếp trước đó.


            while (j >= 0 && randomList.get(j) > key) {
                                                               //j >= 0: Biến j phải lớn hơn hoặc bằng 0, đảm bảo không vượt quá giới hạn của danh sách.
                                                               //randomList.get(j) > key: Phần tử tại vị trí j lớn hơn giá trị của key.

                randomList.set(j + 1, randomList.get(j));      // di chuyển phần tử tại vị trí j sang phải một vị trí, ghi đè lên phần tử tại vị trí j + 1.
                j = j - 1;                                     // giảm giá trị của j đi 1 đơn vị, để di chuyển sang phần tử trước đó trong danh sách.
            }
            randomList.set(j + 1, key);                        //chèn giá trị của key vào vị trí đúng trong danh sách đã sắp xếp trước đó.
        }
    }

    private static List<Integer> getRandom() {
        Random random = new Random();
        return random.ints(20, 0, 100).boxed().collect(Collectors.toList());
    }
}
