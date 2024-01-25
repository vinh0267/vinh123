import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //in ra chuỗi co độ daì lớn hơn 3
        String string = new String("Rekkei Academy để nông dân biết code");

        List<String> stringList = new ArrayList<>();
        String[] newStr = string.split(" ");
        for (String str : newStr) {
            stringList.add(str);
        }

        for (String string1 : stringList){
            if (string1.length() > 3) {
                System.out.println(string1);
            }
        }
    }
}