import java.util.LinkedList;
import java.util.Queue;

public class MinElementUsingQueue {
    public static void main(String[] args) {
        // Mảng đầu vào
        int[] inputArray = {8, 4, 2, 7, 5, 1};

        // Tìm phần tử nhỏ nhất sử dụng Queue
        int minElement = findMinElement(inputArray);

        // In phần tử nhỏ nhất
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }

    public static int findMinElement(int[] array) {
        // Sử dụng Queue để lưu trữ các phần tử của mảng
        Queue<Integer> queue = new LinkedList<>();

        // Thêm các phần tử của mảng vào Queue
        for (int element : array) {
            queue.add(element);
        }

        // Khởi tạo biến lưu trữ phần tử nhỏ nhất
        int minElement = Integer.MAX_VALUE;

        // Duyệt qua các phần tử trong Queue để tìm phần tử nhỏ nhất
        while (!queue.isEmpty()) {
            int currentElement = queue.poll(); // Lấy và loại bỏ phần tử đầu tiên

            // So sánh và cập nhật phần tử nhỏ nhất
            if (currentElement < minElement) {
                minElement = currentElement;
            }
        }

        return minElement;
    }
}
