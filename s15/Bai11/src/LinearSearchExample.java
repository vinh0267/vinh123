import java.util.Scanner;

public class LinearSearchExample {
    private static int linearSearch(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] arr = {1.5, 2.8, 3.2, 4.7, 5.1, 6.9, 7.4, 8.6, 9.0, 10.3};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        double target = scanner.nextDouble();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        }
    }
}