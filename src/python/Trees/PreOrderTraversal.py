class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def preorder_traversal(root):
    if root:
        print(root.value, end=' ')  # Process the root
        preorder_traversal(root.left)  # Traverse left subtree
        preorder_traversal(root.right)  # Traverse right subtree

if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    preorder_traversal(root)
