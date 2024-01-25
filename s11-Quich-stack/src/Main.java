import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //thêm mới
        stack.push("ngỵcs");
        stack.push("jckc");
        stack.push("jckc1");
        //lấy ra ptu trên cùng

        // stack.pop();//vừa lấy vừa xóa,ném ra ngoại lệ nếu rỗng.nên if

        System.out.println(stack.peek());//laasy nhưng k xóa.ném ra ngoại lệ nếu rỗng
        int index = stack.search("jckc1");//tìm kiếm phan tu
        System.out.println(index);

        //duyệt
        //        for (String item : stack) {
        //            System.out.println(item);
        //        }

        while (stack.empty()) {
            System.out.println(stack.pop());
        }


        // queue : hàng đợi FIFO

        Queue<String> queue = new PriorityQueue<>();
        Queue<String> arrayDeque = new ArrayDeque<>();

        //thêm mới vào hàng đợi
        arrayDeque.offer("HTML");
        arrayDeque.offer("CSS");
        arrayDeque.offer("JAVA");

        //lấy ra phần t đầu tiên hàng đợi
        System.out.println(arrayDeque.peek());//lấy và k xóa.k sinh ra ngoại lệ.nếu que rỗng trả về null

        System.out.println(arrayDeque.remove());// lấy và xóa.nếu rỗng sinh ra ngoại lệ

        System.out.println(arrayDeque.element());//lấy và k xóa.k sinh ra ngoại lệ.nếu que rỗng

        System.out.println(arrayDeque.poll()); // lấy và xóa.nếu rỗng k sinh ra ngoại lệ.trả về null

        //duyệt Que
        while ((!arrayDeque.isEmpty())) {
            System.out.println(arrayDeque.remove());
        }


    }
}