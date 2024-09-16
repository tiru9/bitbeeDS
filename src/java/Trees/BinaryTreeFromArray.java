package Trees;

public class BinaryTreeFromArray {
    public static int[] treeToArray(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                list.add(null); // or a sentinel value like -1 if you prefer
            }
        }

        // Remove trailing nulls or sentinel values
        while (list.get(list.size() - 1) == null) { // or the sentinel value
            list.remove(list.size() - 1);
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                array[i] = list.get(i);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        // Example binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int[] array = treeToArray(root);
        System.out.println(Arrays.toString(array));
    }
}
