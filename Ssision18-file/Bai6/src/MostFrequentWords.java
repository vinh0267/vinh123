import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentWords {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\admin\\Desktop\\MD2-java\\Ssision18-file\\Bai6\\src\\text.txt";

        // Bước 1: Đọc nội dung từ tệp văn bản
        String fileContent = readFileContent(filePath);

        // Bước 2: Tính toán tần suất xuất hiện của từng từ
        Map<String, Integer> wordFrequencyMap = calculateWordFrequencies(fileContent);

        // Bước 3: Xác định từ được sử dụng nhiều nhất
        String mostFrequentWord = findMostFrequentWord(wordFrequencyMap);

        // Bước 4: Hiển thị từ được sử dụng nhiều nhất
        if (mostFrequentWord != null) {
            int frequency = wordFrequencyMap.get(mostFrequentWord);
            System.out.println("Most frequent word: " + mostFrequentWord);
            System.out.println("Frequency: " + frequency);
        } else {
            System.out.println("No words found in the file.");
        }
    }

    private static String readFileContent(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static Map<String, Integer> calculateWordFrequencies(String fileContent) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = fileContent.split("\\s+");
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        return wordFrequencyMap;
    }

    private static String findMostFrequentWord(Map<String, Integer> wordFrequencyMap) {
        String mostFrequentWord = null;
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mostFrequentWord;
    }
}