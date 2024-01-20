public class Cylinder extends Circle {
    private double height;

    //tạo 1 đối tợng mới chua thuộc tính của cả 2 class.
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    //getter & setter.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

     //phương thức tính thể tích
    public double thetich() {
        return dientich() * height;
    }
}
