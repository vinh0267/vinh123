import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInFile {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai4\\src\\text.txt";
        String outputFilePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai4\\src\\text1.txt";

        // Bước 1: Tạo file gốc và nhập văn bản (Bạn có thể bỏ qua bước này nếu đã có file gốc)

        // Bước 2: Đọc văn bản thành chuỗi
        String fileContent = readFileContent(inputFilePath);

        // Bước 3: Chuyển đổi chuỗi thành mảng các từ
        String[] words = fileContent.split("\\s+");


        // Bước 4: Đảo ngược mảng các từ
        List<String> reversedWords = Arrays.asList(words);
        Collections.reverse(reversedWords);



        // Bước 5: Ghi ra file mới
        writeToFile(outputFilePath, String.join(" ", reversedWords));
    }

    private static String readFileContent(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}