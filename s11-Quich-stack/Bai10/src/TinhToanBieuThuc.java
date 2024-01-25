import java.util.Stack;

public class TinhToanBieuThuc {
    public static int tinhToan(String bieuThuc) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < bieuThuc.length(); i++) {
            char kyTu = bieuThuc.charAt(i);

            if (Character.isDigit(kyTu)) {
                // Nếu là số, đưa vào stack
                stack.push(Character.getNumericValue(kyTu));
            } else {
                // Nếu là toán tử, lấy hai số trên đỉnh stack và thực hiện phép tính
                int soThuHai = stack.pop();
                int soThuNhat = stack.pop();

                switch (kyTu) {
                    case '+':
                        stack.push(soThuNhat + soThuHai);
                        break;
                    case '-':
                        stack.push(soThuNhat - soThuHai);
                        break;
                    case '*':
                        stack.push(soThuNhat * soThuHai);
                        break;
                    case '/':
                        stack.push(soThuNhat / soThuHai);
                        break;
                }
            }
        }

        // Kết quả nằm trên đỉnh của stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String bieuThuc = "3 4 + 5 * 6 -";
        int ketQua = tinhToan(bieuThuc);
        System.out.println("Kết quả của biểu thức " + bieuThuc + " là: " + ketQua);
    }
}
