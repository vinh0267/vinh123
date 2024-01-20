public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(5.0, "blue");

        // In ra thông tin về Circle
        System.out.println("Circle - Radius: " + circle.getRadius());
        System.out.println("Circle - Color: " + circle.getColor());
        System.out.println("Circle - Area: " + circle.dientich());

        System.out.println();

        // Tạo đối tượng Cylinder
        Cylinder cylinder = new Cylinder(3.0, "red", 7.0);

        // In ra thông tin về Cylinder
        System.out.println("Cylinder - Radius: " + cylinder.getRadius());
        System.out.println("Cylinder - Color: " + cylinder.getColor());
        System.out.println("Cylinder - Height: " + cylinder.getHeight());
        System.out.println("Cylinder - Area: " + cylinder.dientich());
        System.out.println("Cylinder - Volume: " + cylinder.thetich());
    }
}