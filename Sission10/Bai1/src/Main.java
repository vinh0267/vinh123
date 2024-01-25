import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // cách khởi Tạo một danh sách (List) số nguyên gồm 10 phần tử từ 1-10
        List<Integer> integerList = new ArrayList<>();

        // Sử dụng hàm Math.random() để lấy số lượng phần tử ngẫu nhiên trong khoảng từ 1 đến 10
        int numberOfElements = (int) (Math.random() * 10) + 1;

        // Duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phần tử của List
        for (int i = 0; i < numberOfElements; i++) {
            int randomValue = (int) (Math.random() * 100); // Giả sử giá trị ngẫu nhiên từ 0 đến 99
            integerList.add(randomValue);
        }

        // In ra List ngẫu nhiên
        System.out.println("List ngẫu nhiên: " + integerList);

        // Sử dụng phương thức Collections.max() để tìm phần tử lớn nhất
        int maxElement = Collections.max(integerList);

        // In ra phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong List: " + maxElement);
    }
}
