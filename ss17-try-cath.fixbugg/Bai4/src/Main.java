import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //chuyển đổi chuỗi về số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập vào chuỗi cần chuyển đổi sang số nguyên :");
        String s = scanner.nextLine();

        //tạo 1 list các số
        List<Integer> list = new ArrayList<>();
        //duyệt chuỗi
        for (int i = 0; i < s.length(); i++) {
            try {
                //ép kiểu
                int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
                //thêm từng phần tử vào mảng
                list.add(digit);
            } catch (NumberFormatException e) {
                //nếu có lỗi,thay thế = 0 và in ra thông báo
                list.add(0);
                System.out.println("xảy ra lô.ký tự thứ " + s.charAt(i) + " không phải số nguyên.đã thay thế = 0 ");
            }
        }
        System.out.println("List số nguyên sau khi chuyển đổi : " + list);
    }
}