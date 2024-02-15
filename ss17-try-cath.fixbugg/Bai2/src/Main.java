import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng:");
            arr[i] = scanner.nextInt();
        }

        //try cath
        try {
            int soLonNhat = TimSoLonNhat.timSoLonNhatTrongMang(arr);
            System.out.println("Số lớn nhất trong mảng là: " + soLonNhat);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
