import java.util.Scanner;

public class Product {
    private Integer productId;
    private String productName;
    private double price;
    private int quantity;


    public Product() {
    }

    public Product(Integer productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //nhập thuộc tính
    public void inputProductData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhập mã SP :");
        this.productId = Integer.valueOf(scanner.next());

        System.out.println("nhập tên SP ");
        this.productName =scanner.next();

        System.out.println("nhập giá SP :");
        this.price = scanner.nextInt();

        System.out.println(" nhập số lượng : ");
        this.quantity = scanner.nextInt();
    }
}
