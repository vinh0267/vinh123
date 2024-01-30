import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Xin mời nhập một số: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<Integer> list = Arrays.asList(4, 5, 7, 2, 1, 23, 67);

        // Sử dụng Stream API để lọc các số lớn hơn số nhập vào
        List<Integer> filteredList = list.stream().filter(item -> item > number).collect(Collectors.toList());

        // Sử dụng forEach() để in các số đã lọc ra màn hình
        System.out.println("Các số lớn hơn " + number + ": ");
        filteredList.forEach(System.out::println);
    }
}
