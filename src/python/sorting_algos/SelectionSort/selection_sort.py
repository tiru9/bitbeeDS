def selection_sort(arr):
    n = len(arr)
    # Traverse through all elements of the array
    for i in range(n):
        # Find the minimum element in the remaining unsorted array
        min_idx = i
        for j in range(i+1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        # Swap the found minimum element with the first element
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Test the selection_sort function
arr = [30, 40, 20, 50, 10]
print("Original array:", arr)
selection_sort(arr)
print("Sorted array:", arr)

