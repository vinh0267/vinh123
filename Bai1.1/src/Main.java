public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(5.0, "blue");

        // In ra thông tin chi tiết của Circle
        System.out.println(circle.toString());

        System.out.println();

        // Tạo đối tượng Cylinder
        Cylinder cylinder = new Cylinder(3.0, "red", 7.0);

        // In ra thông tin chi tiết của Cylinder
        System.out.println(cylinder.toString());
    }
}