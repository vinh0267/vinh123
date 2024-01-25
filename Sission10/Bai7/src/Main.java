import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(9);

        for (Integer number : integers){
            if (number % 2 ==0 ) {
                System.out.println(number);
            }
        }

    }
}