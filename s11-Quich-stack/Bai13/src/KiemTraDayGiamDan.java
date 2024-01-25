import java.util.Stack;

public class KiemTraDayGiamDan {
    public static boolean kiemTraDayGiamDan(String chuoi) {
        Stack<Character> stack = new Stack<>();

        // Bước 2: Đưa các ký tự của chuỗi vào stack
        for (char kyTu : chuoi.toCharArray()) {
            stack.push(kyTu);
        }

        // Bước 3: Khởi tạo biến flag
        boolean flag = true;

        // Bước 4 và 5: Duyệt qua từng ký tự trong chuỗi
        for (char kyTu : chuoi.toCharArray()) {
            // So sánh với ký tự đầu tiên trong stack
            if (kyTu > stack.peek()) {
                // Bước 5: Nếu ký tự trong chuỗi lớn hơn ký tự đầu tiên trong stack, đặt flag là false và thoát vòng lặp
                flag = false;
                break;
            }
            // Loại bỏ ký tự từ stack
            stack.pop();
        }

        // Bước 6: Kiểm tra flag
        return flag;
    }

    public static void main(String[] args) {
        String chuoi1 = "54321";
        String chuoi2 = "12345";

        System.out.println(chuoi1 + " là dãy giảm dần: " + kiemTraDayGiamDan(chuoi1));
        System.out.println(chuoi2 + " là dãy giảm dần: " + kiemTraDayGiamDan(chuoi2));
    }
}
