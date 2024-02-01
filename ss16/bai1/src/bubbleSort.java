import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class bubbleSort {
    public static void main(String[] args) {
        // Tạo 1 danh sách ngẫu nhiên
        List<Integer> listRandom = getRandom();

        // In ra danh sách ban đầu
        System.out.println("Danh sách mảng:");
        displayList(listRandom);

        // Sắp xếp và in ra danh sách sau khi sắp xếp
        System.out.println("\nDanh sách mảng sau khi sắp xếp:");
        bubbleSort(listRandom);
        displayList(listRandom);
    }

    private static void bubbleSort(List<Integer> listRandom) {
        int n = listRandom.size();

        for (int i = 0; i < n - 1; i++) {                             // 1, 3, 7, 6, 5        i = (0-4)
                                                                   // Vòng lặp i được sử dụng để kiểm soát số lượng lần lặp cần thiết.
            for (int j = 0; j < n - i - 1; j++) {
                                                                      //nếu i thỏa màn điều kiện th j chạy hết vòng for. lúc nào j cũng bắt đầu từ vị trí đầu tiên
                if (listRandom.get(j) > listRandom.get(j + 1)){        //nếu j > j+1
                    int temp = listRandom.get(j);                       // gán phần tử đầu tiên cho temp .          gan 7 cho temp

                    listRandom.set(j,listRandom.get(j+1))                ; //gán j+1 cho j                   gán 6 cho 7

                    listRandom.set(j+1,temp);                           // gán temp cho j+1                           gán tem cho 7.mảng sẽ là 1 3 6 7 5
                }
            }
        }
    }

    private static void displayList(List<Integer> listRandom) {
        listRandom.forEach(value -> System.out.print(value + "   "));
    }

    private static List<Integer> getRandom() {
        Random random = new Random();
        return random.ints(20, 0, 100).boxed().collect(Collectors.toList());
    }
}
