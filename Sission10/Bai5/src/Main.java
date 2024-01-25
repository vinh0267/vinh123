import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //in ra chuỗi co độ daì it nhat
        String string = new String("Rekkei Academy để nông dân biết code");

        List<String> stringList = new ArrayList<>();
        String[] newStr = string.split(" ");
        for (String str : newStr) {
            stringList.add(str);
        }

        String shortestWord = stringList.get(0); // Giả sử từ đầu tiên là từ ngắn nhất

        for (String word : stringList) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        // In ra phần tử có độ dài ngắn nhất
        System.out.println("Phần tử có độ dài ngắn nhất: " + shortestWord);
    }
}
