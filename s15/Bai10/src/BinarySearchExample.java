import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchExample {
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        int minIndex = binarySearch(arr, min);
        int maxIndex = binarySearch(arr, max);

        int count = 0;
        if (minIndex != -1 && maxIndex != -1) {
            count = Math.abs(minIndex - maxIndex) + 1;
        }

        System.out.println("Số lượng số tìm thấy: " + count);
        if (count > 0) {
            System.out.println("Chi tiết số tìm thấy:");
            for (int i = minIndex; i <= maxIndex; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}