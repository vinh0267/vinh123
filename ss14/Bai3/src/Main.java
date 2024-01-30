import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 5, 9, 6, 4);

        List<Integer> sum = integers.stream().reduce();


    }
}