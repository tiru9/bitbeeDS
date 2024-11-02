import Trees.TreeNode;

public class PreOrderTraversal{
  public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");  // Process the root
        preorderTraversal(root.left);  // Traverse left subtree
        preorderTraversal(root.right);  // Traverse right subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PreOrderTraversal tree = new PreOrderTraversal();
        tree.preorderTraversal(root);
    }
}
