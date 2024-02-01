import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> random = getArr();

        System.out.println("dah sac các số nẫu nhiên :");
        randomList(random);

        int maxValue = maxValue(random);
        System.out.println("số lớn nhất là " + maxValue);


    }

    //số lớn nhất
    private static int maxValue(List<Integer> random) {
        return random.stream().max(Integer::compareTo).orElseThrow();
    }
    //in danh sách
    private static void randomList(List<Integer> random) {
        random.forEach(value -> System.out.println(value + " "));
    }

    //soos ngâ nhiên
    private static List<Integer> getArr() {
        Random random = new Random();
        return random.ints(20, 0, 100).boxed().collect(Collectors.toList());
    }

}