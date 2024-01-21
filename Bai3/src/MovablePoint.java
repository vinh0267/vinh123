public class MovablePoint extends Point {
    // Thuộc tính xSpeed và ySpeed của điểm di chuyển, mặc định là 0.0f
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Phương thức khởi tạo với x, y, xSpeed và ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Phương thức khởi tạo mặc định
    public MovablePoint() {
    }

    // Phương thức khởi tạo với xSpeed và ySpeed
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter cho xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter cho xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter cho ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter cho ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Setter cho cả xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter trả về mảng chứa xSpeed và ySpeed
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Phương thức toString để in ra thông tin chi tiết của đối tượng, kế thừa từ lớp cha
    @Override
    public String toString() {
        return super.toString() + ", speed = (" + xSpeed + "," + ySpeed + ")";
    }

    // Phương thức di chuyển điểm theo xSpeed và ySpeed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // Hàm main để kiểm thử lớp MovablePoint
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.1f, 0.2f);
        System.out.println("Initial state: " + movablePoint);

        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
    }
}
