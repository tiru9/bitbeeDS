public class PostOrderTraversal{
  public void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);  // Traverse left subtree
        postorderTraversal(root.right);  // Traverse right subtree
        System.out.print(root.value + " ");  // Process the root
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        tree.postorderTraversal(root);
    }
}
