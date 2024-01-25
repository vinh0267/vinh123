import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        //chuyển thành chữ thường và loại bỏ khoảng trắng
        String normalizedInput = input.toLowerCase().replaceAll(" ", "");

        // Tạo queue
        Queue<Character> charQueue = new LinkedList<>();

        // Đưa từng ký tự của chuỗi vào queue
        for (char c : normalizedInput.toCharArray()) {
            charQueue.add(c);
        }

        // So sánh từng ký tự của chuỗi với phần tử dequeue từ queue
        while (!charQueue.isEmpty()) {
            if (charQueue.remove() != normalizedInput.charAt(0)) {
                return false;
            }
            normalizedInput = normalizedInput.substring(1);
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "Able was I ere I saw Elba";
        boolean result = isPalindrome(inputString);

        if (result) {
            System.out.println("\"" + inputString + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" không phải là chuỗi Palindrome.");
        }
    }
}
