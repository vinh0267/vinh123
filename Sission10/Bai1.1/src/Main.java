import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //lấy số lượng ngẫu nhiên
        int numberRandom = (int) (Math.random() * 10 + 1);
        //duyệt qua mảng và gán tưng phan tử vào list
        for (int i = 0; i < numberRandom; i++) {
            int randomValue = (int) (Math.random() * 100);
            list.add(randomValue);
        }
        //in ra list
        System.out.println(list);
        //tìm phần tử lớn nhất
        int maxElemen = Collections.max(list);
        System.out.println(maxElemen);
    }
}