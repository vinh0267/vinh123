import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai3\\src\\text.txt"; // Đường dẫn đến tệp văn bản cần đọc

        try {
            // Bước 1: Đọc nội dung từ tệp thành một chuỗi
            String content = readFileContent(filePath);

            // Bước 2: Chuyển đổi chuỗi thành mảng các từ
            String[] words = content.split("\\s+");

            // Bước 3: Tạo danh sách để lưu các từ có độ dài lớn nhất
            List<String> longestWords = new ArrayList<>();

            // Bước 4: Duyệt qua mảng từ để tìm độ dài lớn nhất
            int maxLength = 0;
            for (String word : words) {
                int length = word.length(); //lấy độ dài
                if (length > maxLength) { // So sánh độ dài vừa lấy được với maxLength
                    //Nếu độ dài lớn hơn maxLength, tức là tìm thấy từ có độ dài lớn hơn,
                    maxLength = length;  //ta cập nhật maxLength thành độ dài mới
                    longestWords.clear(); //và xóa danh sách longestWords
                    longestWords.add(word); //sau đó thêm từ mới
                } else if (length == maxLength) { //Nếu độ dài bằng maxLength, tức là tìm thấy từ có cùng độ dài với từ lớn nhất hiện tại,
                    longestWords.add(word);  // ta thêm từ đó vào danh sách longestWords.
                }
            }

            // Bước 5: In ra các từ có độ dài lớn nhất và độ dài của chúng
            for (String word : longestWords) {
                System.out.println("Từ: " + word + ", Độ dài: " + maxLength);
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp văn bản: " + e.getMessage());
        }
    }

    //đọc nội dung từ một tệp văn bản và trả về nội dung dưới dạng một chuỗi
    private static String readFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try {
            // BufferedReader để đọc từng dòng trong tệp văn bản
            BufferedReader reader = new BufferedReader(new FileReader(filePath)); // FileReader : mở tệp
            String line;

            while ((line = reader.readLine()) != null) { //reader : đọc từng dòng.
                content.append(line).append("\n");
            }
        } finally {

        }
        return content.toString();
    }
}