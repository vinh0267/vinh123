import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("k","o","d","a","b");

        List<String> newStrings = strings.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());

        System.out.println("mang sau khi sap xep :" + newStrings);
    }
}