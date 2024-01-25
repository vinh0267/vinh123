import java.util.Stack;

public class MaxElementUsingStack {
    public static void main(String[] args) {
        // Mảng đầu vào
        int[] inputArray = {3, 7, 2, 8, 5, 1};

        // Tìm phần tử lớn nhất sử dụng Stack
        int maxElement = findMaxElement(inputArray);

        // In phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }

    // Phương thức tìm phần tử lớn nhất trong mảng sử dụng Stack
    public static int findMaxElement(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            // Kiểm tra stack có rỗng không và phần tử đang xét có lớn hơn phần tử đỉnh của stack không
            while (!stack.isEmpty() && element > stack.peek()) {
                stack.pop(); // Lấy phần tử trên đỉnh của stack ra khỏi stack
            }
            stack.push(element); // Đưa phần tử đang xét vào stack
        }

        // Phần tử lớn nhất nằm trên đỉnh của stack
        return stack.peek();
    }
}
