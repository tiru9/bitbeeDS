class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def postorder_traversal(root):
    if root:
        postorder_traversal(root.left)  # Traverse left subtree
        postorder_traversal(root.right)  # Traverse right subtree
        print(root.value, end=' ')  # Process the root

if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    postorder_traversal(root)
