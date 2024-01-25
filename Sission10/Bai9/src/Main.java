import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);

        List<Integer> newNumber = new ArrayList<>();
        for (Integer index :number){
            if (!newNumber.contains(index)) {
                newNumber.add(index);
            }
        }
        System.out.println(newNumber);
    }
}