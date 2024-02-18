import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        // Đường dẫn đến tệp văn bản
        String filePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai1\\src\\file.txt";

        // Đọc nội dung từ tệp văn bản
        String fileContent = readFile(filePath);

        // Đếm số lượng từ trong nội dung
        int wordCount = countWords(fileContent);

        // Hiển thị số lượng từ
        System.out.println("Số lượng từ trong tệp văn bản là: " + wordCount);
    }

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static int countWords(String fileContent) {
        String[] words = fileContent.split("\\s+");
        return words.length;
    }
}