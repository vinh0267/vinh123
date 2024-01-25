import java.util.Scanner;
import java.util.TreeMap;

public class DemTuTrongVanBan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản:");
        String vanBan = scanner.nextLine();

        TreeMap<String, Integer> demTuMap = new TreeMap<>();

        // Tách từ trong văn bản và đếm số lần xuất hiện
        String[] cacTu = vanBan.split("\\s+");

        for (String tu : cacTu) {
            // Chuyển tất cả thành chữ thường để tránh phân biệt chữ hoa và chữ thường
            tu = tu.toLowerCase();

            // Kiểm tra xem từ đã có trong TreeMap chưa
            if (demTuMap.containsKey(tu)) {
                // Nếu có, tăng giá trị (số lần xuất hiện)
                demTuMap.put(tu, demTuMap.get(tu) + 1);
            } else {
                // Nếu chưa có, thêm từ vào TreeMap với giá trị là 1
                demTuMap.put(tu, 1);
            }
        }

        // Hiển thị số lần xuất hiện của từng từ
        System.out.println("Số lần xuất hiện của từng từ:");
        for (String tu : demTuMap.keySet()) {
            System.out.println(tu + ": " + demTuMap.get(tu) + " lần");
        }
    }
}
