import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 6, 8, 9, 4, 32, 22);

        boolean containVal = list.stream().anyMatch(n -> n % 2 == 0);

        if (containVal){
            System.out.println("danh sách có ít nhất 1 số chẵn");
        } else {
            System.out.println("danh sách không có bâ cứ số chẵn nào");
        }
    }
}