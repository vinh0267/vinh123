public class Nhap {
    private int Slow=1;
    private int Medium=2;
    private int Fast=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Nhap(int slow, int medium, int fast, int speed, boolean on, double radius, String color) {
        Slow = slow;
        Medium = medium;
        Fast = fast;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
