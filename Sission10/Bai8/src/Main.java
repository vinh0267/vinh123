import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(12);
        number.add(14);

        List<Integer> newNumber = new ArrayList<>();
        newNumber.addAll(number);
        System.out.println(newNumber);

    }
}