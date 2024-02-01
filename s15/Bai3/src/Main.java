import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                //Mỗi phần tử trong mảng được khởi tạo với một số nguyên ngẫu nhiên từ 0 đến 99.
            }
        }
        return arr;
    }

    // tìm kiếm một số target trong mảng 2 chiều arr
    private static boolean searchNumber(int[][] arr, int target, List<Integer> rowIndices, List<Integer> colIndices) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowIndices.add(i);
                    colIndices.add(j);
                    //Nếu số target được tìm thấy trong arr,
                    // vị trí của nó (dòng và cột) sẽ được lưu vào các danh sách rowIndices và colIndices.
                    check = true;
                }
            }
        }
        return check;
    }

    //
    public static void main(String[] args) {
        int[][] arr = getArr();

        System.out.println("Mảng 2 chiều:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        List<Integer> rowIndices = new ArrayList<>();
        List<Integer> colIndices = new ArrayList<>();
        boolean found = searchNumber(arr, target, rowIndices, colIndices);

        if (found) {
            System.out.println("Số " + target + " được tìm thấy tại các vị trí:");
            for (int i = 0; i < rowIndices.size(); i++) {
                int row = rowIndices.get(i);
                int col = colIndices.get(i);
                System.out.println("[" + row + ", " + col + "]");
            }
        } else {
            System.out.println("Số " + target + " không được tìm thấy trong mảng.");
        }
    }
}