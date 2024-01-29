import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    // Thêm sản phẩm
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        Product newProduct = new Product();

        newProduct.inputProductData();

        productList.add(newProduct);
        System.out.println("Sản phẩm đã được thêm vào danh sách.");
    }

    //hiển thi sp

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : productList) {
                System.out.println("ID: " + product.getProductId() +
                        ", Tên: " + product.getProductName() +
                        ", Giá: $" + product.getPrice() +
                        ", Số lượng: " + product.getQuantity());
            }
        }
    }

    public void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập ID sản phẩm cần sửa:");
        int editIdProduct = scanner.nextInt();

        boolean productFound = false;
        for (Product product : productList) {
            if (product.getProductId().equals(editIdProduct)) {
                productFound = true;

                System.out.println("Nhập mã SP mới:");
                product.setProductId(scanner.nextInt());

                System.out.println("Nhập tên SP mới:");
                product.setProductName(scanner.next());

                System.out.println("Nhập giá SP mới:");
                product.setPrice(scanner.nextDouble());

                System.out.println("Nhập số lượng mới:");
                product.setQuantity(scanner.nextInt());

                System.out.println("Sản phẩm đã được cập nhật.");
                break;
            }
        }

        if (!productFound) {
            System.out.println("Không tìm thấy sản phẩm với ID: " + editIdProduct);
        }
    }

    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời nhập vao ID cần xóa");
        int deleteId = scanner.nextInt();
        boolean checkId = false;

        for (Product prod : productList) {
            if (prod.getProductId().equals(deleteId)) {
                checkId = true;
                productList.remove(prod);
                System.out.println(" sp đã dk xóa");
                break;
            } else if (!checkId) {
                System.out.println(" không tìm thấy sản phẩm với ID là :" + deleteId);
            }
        }
    }

    public void searchByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên sản phẩm cần tìm:");
        String nameProduct = scanner.nextLine();
        boolean checkName = false;

        System.out.println("Kết quả tìm kiếm:");

        for (Product prod : productList) {
            if (prod.getProductName().equalsIgnoreCase(nameProduct)) {
                // so san k phân biệt chữ hoa và chữ thường
                checkName = true;
                System.out.println("ID: " + prod.getProductId() +
                        ", Tên: " + prod.getProductName() +
                        ", Giá: $" + prod.getPrice() +
                        ", Số lượng: " + prod.getQuantity());
            }
        }

        if (!checkName) {
            System.out.println("Không tìm thấy sản phẩm với tên: " + nameProduct);
        }
    }

    public void sortByPrice(boolean ascending) {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        // Sử dụng lớp Comparator để so sánh giá của các sản phẩm
        Comparator<Product> priceComparator = new Comparator<Product>() {
         // tạo đối tượng priceComparator và tạo 1 lớp vô danh
            @Override
            public int compare(Product product1, Product product2) {
                if (ascending) {
                    return Double.compare(product1.getPrice(), product2.getPrice());
                } else {
                    return Double.compare(product2.getPrice(), product1.getPrice());
                }
            }
        };

        // Sắp xếp danh sách sản phẩm
        Collections.sort(productList, priceComparator);

        // Hiển thị danh sách sản phẩm đã sắp xếp
        System.out.println("Danh sách sản phẩm (sắp xếp theo giá " + (ascending ? "tăng dần" : "giảm dần") + "):");
        for (Product product : productList) {
            System.out.println("ID: " + product.getProductId() +
                    ", Tên: " + product.getProductName() +
                    ", Giá: $" + product.getPrice() +
                    ", Số lượng: " + product.getQuantity());
        }
    }
}

