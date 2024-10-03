# Tree (Cây)

### Cây là gì?

Tree là một cấu trúc dữ liệu tương tự như một **linked list** nhưng thay vì mỗi node chỉ đơn giản chỉ đến node tiếp theo
theo kiểu tuyến tính, ở tree mỗi node trỏ đến một số node khác. Tree là một ví dụ về cấu trúc dữ liệu phi tuyến. Cấu
trúc cây là một cách thể hiện bản chất thứ bậc của cấu trúc dưới dạng đồ họa.

<img src="../../../src/assets/images/tree.png" alt="">

### Các Thành Phần Cơ Bản của Cây

<img src="../../../src/assets/images/459bc731ea3f84b3bb443117478644f122eeaac8.png">

* **Nút (Node)**: Mỗi nút trong cây chứa dữ liệu và có thể có các nút con.
* **Root**: Nút đầu tiên hoặc nút gốc của cây. Đây là nút không có nút cha.
* **Leaf (Lá)**: Nút không có nút con nào.
* **Subtree**: Một cây con là một nhánh của cây chính.
* **Độ sâu (Depth)**: Khoảng cách từ nút gốc đến nút hiện tại.
* Chiều cao (Height): Số lượng cạnh dài nhất từ nút gốc đến nút lá.nút lá

### Cây Nhị Phân (Binary Tree)

Cây nhị phân là loại cây mà mỗi nút có tối đa hai nút con: left (trái) và right (phải).

<img src="../../../src/assets/images/binary-tree.png" alt="" />

```java
import com.sun.source.tree.Tree;

public class myBinaryTree {
    public class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode root;

    public myBinaryTree() {
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
    }
}
```

### Cây nhị phân tìm kiếm (Binary Search Tree)

Binary Search Tree (Cây nhị phân tìm kiếm) là một dạng đặc biệt của cây nhị phân, trong đó:

* Nút con bên trái có giá trị nhỏ hơn nút cha.
* con bên phải có giá trị lớn hơn nút cha.

BST giúp tìm kiếm, chèn và xóa phần tử hiệu quả, với thời gian trung bình là O(log n).

<img src="../../../src/assets/images/bst.png" alt="">

```java
public class BinarySearchTree {
    TreeNode root;

    class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public TreeNode addTreeNode(TreeNode root, int val) {
        TreeNode newTreeNode = new TreeNode(val);
        //Trường hợp root bằng null;
        if (root == null) {
            return newTreeNode;
        } else {
            TreeNode tmp = root;
            while (true) {
                if (tmp.value > val) {
                    if (tmp.right == null) {
                        tmp.right = newTreeNode;
                        break;
                    } else {
                        tmp = tmp.right;
                    }
                } else {
                    if (tmp.left == null) {
                        tmp.right = newTreeNode;
                        break;
                    } else {
                        tmp = tmp.left;
                    }
                }
            }
            return root;
        }
    }
}
```
