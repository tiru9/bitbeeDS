from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def build_binary_tree_from_array(array):
    if not array:
        return None

    root = TreeNode(array[0])
    queue = deque([root])
    index = 1

    while queue and index < len(array):
        node = queue.popleft()

        if array[index] is not None:
            node.left = TreeNode(array[index])
            queue.append(node.left)
        index += 1

        if index < len(array) and array[index] is not None:
            node.right = TreeNode(array[index])
            queue.append(node.right)
        index += 1

    return root

def binary_tree_to_array(root):
    if not root:
        return []

    queue = deque([root])
    result = []

    while queue:
        node = queue.popleft()
        if node:
            result.append(node.val)
            queue.append(node.left)
            queue.append(node.right)
        else:
            result.append(None)

    # Remove trailing None values
    while result[-1] is None:
        result.pop()

    return result

# Example usage:
array = [1, 2, 3, 4, 5, 6, 7]
root = build_binary_tree_from_array(array)
array_from_tree = binary_tree_to_array(root)
print(array_from_tree)