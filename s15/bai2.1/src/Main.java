import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //lấy số ngẫu nhiên
    public static List<Integer> getArr() {
        Random random = new Random();
        return random.ints(20, 0, 100).boxed().collect(Collectors.toList());
    }

    //in ra danh sách

    public static void prinList(List<Integer> randomList){
        randomList.forEach(value -> System.out.println(value+" "));
    }
    //tìm giá trị nhỏ nhất
    private static int minNumber(List<Integer> randomList) {
       return randomList.stream().min(Integer::compareTo).orElseThrow();
    }

    //chạy chương trình
    public static void main(String[] args) {
        List<Integer> randomList = getArr();

        System.out.println(" danh sách các số nguyên :" );
        prinList(randomList);

        int minNumber =minNumber(randomList);
        System.out.println("số nhỏ nhất là : " + minNumber);

    }


}