def quick_sort(arr, low, high):
    if low < high:
        # Find the pivot index
        pivot_index = partition(arr, low, high)

        # Recursively sort the elements before and after the partition
        quick_sort(arr, low, pivot_index - 1)
        quick_sort(arr, pivot_index + 1, high)

def partition(arr, low, high):
    # Choose the rightmost element as the pivot
    pivot = arr[high]
    i = low - 1  # Index of the smaller element

    for j in range(low, high):
        # If the current element is less than or equal to the pivot
        if arr[j] <= pivot:
            i += 1

            # Swap arr[i] with arr[j]
            arr[i], arr[j] = arr[j], arr[i]

    # Swap the pivot element with the element at i+1
    arr[i + 1], arr[high] = arr[high], arr[i + 1]

    # Return the partition index
    return i + 1

# Example usage:
arr = [10, 7, 8, 9, 1, 5]
n = len(arr)

# Call quick_sort on the entire array
quick_sort(arr, 0, n - 1)

# Print the sorted array
print("Sorted array:")
print(arr)
