import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //đường dẫn
        String filePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai1.1\\src\\file.txt";
        //đọc nội dung
        String fileContent = readFile(filePath);
        //đếm số lượng tù
        int wordCount = countWords(fileContent);
        //hiển thị số lượng từ
        System.out.println("số lượng từ trong văn bản là : " + wordCount);
    }

    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try  {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }

    private static int countWords(String fileContent) {
        String[] word = fileContent.split("\\s+");
        return word.length;
    }
}