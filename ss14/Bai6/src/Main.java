import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("tôi", "đang", "học", "code", "code", "rất" ,"dễ");

        List<String> upperCase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCase);


    }
}