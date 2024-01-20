public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getter setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //dien tich
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //toString
    @Override
    public String toString() {
        return "Circle radius :" + radius+ ",color :" + color+ ",dien tich :" + getArea();
    }
}

