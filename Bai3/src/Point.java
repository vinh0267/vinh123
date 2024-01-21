public class Point {
    // Thuộc tính x và y của điểm, mặc định là 0.0f
    private float x = 0.0f;
    private float y = 0.0f;

    // Phương thức khởi tạo với x và y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức khởi tạo mặc định
    public Point() {
    }

    // Getter cho x
    public float getX() {
        return x;
    }

    // Getter cho y
    public float getY() {
        return y;
    }

    // Setter cho x
    public void setX(float x) {
        this.x = x;
    }

    // Setter cho y
    public void setY(float y) {
        this.y = y;
    }

    // Setter cho cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter trả về mảng chứa x và y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Phương thức toString để in ra thông tin chi tiết của đối tượng
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
