import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        // Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        int[] intArray = {1, 2, 3, 4, 5};
        reverseArray(intArray);
        System.out.println("Mảng sau khi đảo ngược: ");
        for (int element : intArray) {
            System.out.print(element + " ");
        }

        System.out.println(); // In một dòng mới để ngăn cách giữa đảo ngược mảng và đảo ngược chuỗi

        // Đảo ngược chuỗi sử dụng Stack
        String inputString = "Hello World";
        String reversedString = reverseString(inputString);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);
    }

    // Phương thức đảo ngược phần tử trong mảng số nguyên sử dụng Stack
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // Phương thức đảo ngược chuỗi sử dụng Stack
    public static String reverseString(String input) {
        Stack<Character> charStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.pop());
        }

        return reversedString.toString();
    }
}
