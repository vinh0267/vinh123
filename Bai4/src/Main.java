
// Mã kiểm thử
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Thông tin tam giác:");
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());

        scanner.close();
    }
}