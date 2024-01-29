// Định nghĩa lớp Node để biểu diễn một nút trong BST
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Định nghĩa lớp BST (Binary Search Tree)
class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Phương thức để thêm một nút vào BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Phương thức đệ quy để thêm một nút vào BST
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Phương thức để duyệt theo thứ tự preorder trong BST
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        // In ra giá trị của nút hiện tại
        System.out.print(node.data + " ");

        // Duyệt cây con trái
        preorderTraversal(node.left);

        // Duyệt cây con phải
        preorderTraversal(node.right);
    }
}

// Lớp chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Thêm các nút vào BST
        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        // Duyệt theo thứ tự preorder và in ra các phần tử
        System.out.println("Thứ tự preorder trong BST:");
        bst.preorderTraversal(bst.root);
    }
}