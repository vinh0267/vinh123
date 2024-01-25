import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> string = new Stack<>();
        System.out.println("moi nhap vao so luong tu :");
        int numberOfWord = scanner.nextInt();

        for (int i = 0; i <numberOfWord ; i++) {
            System.out.println(" moi nhap vao tu " + (i+1));
            scanner.nextLine();
            String word = scanner.nextLine();
            string.push(word);
        }
        System.out.println("văn bản đảo ngược là :");
        while (!string.empty()) {
            System.out.println(string.pop());
        }

    }
}
