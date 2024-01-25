import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Lấy phần tử đầu tiên ra khỏi hàng đợi
        String firstElement = queue.poll();
        System.out.println("First element: " + firstElement);

        // Lấy phần tử đầu tiên mà không xóa khỏi hàng đợi
        String peekElement = queue.peek();
        System.out.println("Peek element: " + peekElement);

        // In ra tất cả các phần tử trong hàng đợi
        System.out.println("Queue elements: ");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}