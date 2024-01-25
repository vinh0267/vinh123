import java.util.Stack;

public class KiemTraDaySoNguyenTo {
    public static boolean kiemTraSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean kiemTraDaySoNguyenTo(String chuoi) {
        // Bước 1: Tạo một stack để lưu trữ các ký tự trong chuỗi đầu vào
        Stack<Character> stack = new Stack<>();

        // Bước 2: Duyệt qua từng ký tự trong chuỗi và kiểm tra xem ký tự có phải là số hay không
        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isDigit(kyTu)) {
                stack.push(kyTu);
            }
        }

        // Bước 3: Lấy từng ký tự từ stack và kiểm tra xem chúng có phải là số nguyên tố hay không
        while (!stack.isEmpty()) {
            int so = Character.getNumericValue(stack.pop());
            if (!kiemTraSoNguyenTo(so)) {
                return false;
            }
        }

        // Bước 4: Trả về true nếu tất cả các số trên stack là số nguyên tố
        return true;
    }

    public static void main(String[] args) {
        String chuoi1 = "237";
        String chuoi2 = "12345";
        String chuoi3 = "abcde";

        System.out.println(chuoi1 + " là dãy số nguyên tố: " + kiemTraDaySoNguyenTo(chuoi1));
        System.out.println(chuoi2 + " là dãy số nguyên tố: " + kiemTraDaySoNguyenTo(chuoi2));
        System.out.println(chuoi3 + " là dãy số nguyên tố: " + kiemTraDaySoNguyenTo(chuoi3));
    }
}
