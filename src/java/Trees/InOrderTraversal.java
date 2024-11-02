import Trees.TreeNode;

public class InOrderTraversal{
 public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);  // Traverse left subtree
        System.out.print(root.val + " ");  // Process the root
        inorderTraversal(root.right);  // Traverse right subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InOrderTraversal tree = new InOrderTraversal();
        tree.inorderTraversal(root);
    }
}
