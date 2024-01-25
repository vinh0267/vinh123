import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập danh sách cách nhau bằng khoảng trống :");
        String[] string = sc.nextLine().split(" ");

        Queue<String> queue = new LinkedList<>();

        for (String item : string) {
            queue.add(item);
        }
        System.out.println("các phần tử của danh sách là :");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}