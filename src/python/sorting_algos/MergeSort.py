def merge(left, right):
    # Initialize an empty list to store the merged result
    merged = []
    
    # Merge the two lists together until one is empty
    while left and right:
        if left[0] <= right[0]:
            merged.append(left.pop(0))
        else:
            merged.append(right.pop(0))
    
    # Add any remaining elements from the left list
    while left:
        merged.append(left.pop(0))
    
    # Add any remaining elements from the right list
    while right:
        merged.append(right.pop(0))
    
    return merged

def merge_sort(arr):
    # If the list is a single element, return it (base case)
    if len(arr) <= 1:
        return arr
    
    # Find the middle point to divide the list into two halves
    middle = len(arr) // 2
    left_half = arr[:middle]
    right_half = arr[middle:]
    
    # Recursively sort the two halves
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)
    
    # Merge the sorted halves
    return merge(left_half, right_half)

# Example usage:
arr = [38, 27, 43, 3, 9, 82, 10]
sorted_arr = merge_sort(arr)
print("Sorted array:", sorted_arr)
