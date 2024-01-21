// Lớp Shape
class Shape {
    private String color;  // Trường dữ liệu color

    public Shape() {
        color = "unknown";  // Phương thức khởi tạo không có tham số, mặc định color là "unknown"
    }

    public Shape(String color) {
        this.color = color;  // Phương thức khởi tạo có tham số, gán giá trị color từ tham số truyền vào
    }

    public String getColor() {
        return color;  // Phương thức truy cập giá trị color
    }

    public void setColor(String color) {
        this.color = color;  // Phương thức thiết lập giá trị color
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";  // Phương thức toString() trả về thông tin của đối tượng Shape dưới dạng chuỗi ký tự.
    }
}

// Lớp Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Gọi phương thức khởi tạo không có tham số của lớp cha (Shape)
    public Triangle() {
        super();
        // Gán giá trị mặc định là 1.0
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        // Gán giá trị từ tham số truyền vào cho từng side
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // // Tính và trả về diện tích của tam giác
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;  // Tính giá trị s (nửa chu vi)
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Tính và trả về chu vi của tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle[side1=" + side1 + ",side2=" + side2 + ",side3=" + side3 + "," + super.toString() + "]";  // Phương thức toString() trả về thông tin của đối tượng Triangle dưới dạng chuỗi ký tự
    }
}