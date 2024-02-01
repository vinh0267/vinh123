import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchInStringList {
    public static void main(String[] args) {
        //  Tạo danh sách chuỗi
        List<String> stringList = getStringList();

        //  Lấy chuỗi cần tìm từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần tìm: ");
        String targetString = scanner.nextLine();

        //Tìm kiếm tuyến tính và in ra kết quả
        boolean result = linearSearch(stringList, targetString);
        if (result) {
            System.out.println("Chuỗi \"" + targetString + "\" được tìm thấy trong danh sách.");
        } else {
            System.out.println("Không tìm thấy chuỗi \"" + targetString + "\" trong danh sách.");
        }
    }

    // Hàm tạo danh sách chuỗi
    private static List<String> getStringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");
        stringList.add("Ruby");
        return stringList;
    }

    // Hàm tìm kiếm tuyến tính trong danh sách chuỗi
    private static boolean linearSearch(List<String> stringList, String target) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals(target)) {
                System.out.println("Chuỗi \"" + target + "\" được tìm thấy tại vị trí " + i);
                return true; // Trả về true nếu tìm thấy
            }
        }
        return false; // Trả về false nếu không tìm thấy
    }
}
