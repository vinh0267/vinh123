import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Đếm số lần xuất hiện của 1 từ trong 1 đoạn văn
        String str = new String("Trong Java, LinkedHashSet là một lớp cài đặt giao diện Set trong gói java.util");

        System.out.println("moi nhap vao tu can tim :");
        Scanner sc = new Scanner(System.in);
        String newWord = sc.nextLine();

        String[] newStr = str.split("");

        int count = 0;
        for (String word : newStr) {
            word = word.replaceAll("[^a-zA-z0-9]", "");
            if (newWord.equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của từ '" + newWord + "' là: " + count + " lần");
    }
}