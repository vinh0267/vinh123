import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.println("=====================PRODUCT MANAGEMENT=======================");
            System.out.println("1. Thêm sản phẩm. ");
            System.out.println("2. Hiển thị sản phẩm. ");
            System.out.println("3. Sửa sản phẩm.");
            System.out.println("4. Xóa sản phẩm.");
            System.out.println("5. Tìm kiếm sản phẩm.");
            System.out.println("6. Sắp xếp sản phẩm.");
            System.out.println("0. Thoát.");
            System.out.println();

            System.out.println("Nhập lựa chọn : ");
            byte choice = Byte.parseByte(scanner.nextLine());

            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.displayProducts();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    System.out.println("Chọn thứ tự sắp xếp:");
                    System.out.println("1. Giá tăng dần");
                    System.out.println("2. Giá giảm dần");
                    int sortChoice = scanner.nextInt();

                    switch (sortChoice) {
                        case 1:
                            productManager.sortByPrice(true);  // Sắp xếp theo giá tăng dần
                            break;
                        case 2:
                            productManager.sortByPrice(false);  // Sắp xếp theo giá giảm dần
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Ứng dụng kết thúc.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
