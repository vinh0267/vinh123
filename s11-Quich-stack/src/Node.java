import java.util.Comparator;

public class Node {
    //Comparable và Comparator : so sánh các đối tượng
    //Comparator :compare()
    //Comparable : một phương thức duy nhất là compareTo().được sử dụng để xác định cách so sánh hai đối tượng.
    // Phương thức này trả về một số nguyên dương, số âm hoặc 0 tương ứng với kết quả so sánh giữa hai đối tượng.


    // một Queue (hàng đợi) là một cấu trúc dữ liệu hỗ trợ việc lưu trữ và truy xuất các phần tử theo quy tắc "First-In-First-Out"
    // (FIFO), tức là phần tử được thêm vào trước sẽ được lấy ra trước.
    // Java cung cấp một interface Queue trong gói java.util để đại diện cho một hàng đợi.
    // Một số lớp cơ sở và lớp triển khai của Queue trong Java bao gồm:
    //LinkedList: Lớp này triển khai cả Queue và Deque (Double Ended Queue).
    //ArrayDeque: Lớp này triển khai cả Queue và Deque, dựa trên một mảng động.
    //PriorityQueue: Lớp này triển khai Queue và sử dụng một heap nhị phân để cung cấp hàng đợi ưu tiên.
    int data;
    Node link;

    public Node() {
    }

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
