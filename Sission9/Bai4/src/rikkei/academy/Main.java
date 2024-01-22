package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Xanh", 5, 10);
        Shape circle = new Circle("Đỏ", 7);

        rectangle.display();
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        circle.display();
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}