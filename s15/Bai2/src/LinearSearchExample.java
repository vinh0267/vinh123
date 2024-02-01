import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LinearSearchExample {

    private static List<Integer> getArr() {
        Random random = new Random();
        return random.ints(20, 0, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    // In ra danh sách.
    private static void printList(List<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
    }

    private static int minValue(List<Integer> list) {
        return list.stream()
                .min(Integer::compareTo)
                .orElseThrow();
    }

    public static void main(String[] args) {
        List<Integer> randomList = getArr();

        System.out.println("Danh sách số nguyên:");
        printList(randomList);

        int minVal = minValue(randomList);
        System.out.println("\nSố nhỏ nhất trong danh sách: " + minVal);
    }
}
