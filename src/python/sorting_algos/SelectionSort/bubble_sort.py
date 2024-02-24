def bubble_sort(arr):
    n = len(arr)
    # Traverse through all elements of the array
    for i in range(n):
        # Last i elements are already in place, so no need to check them
        for j in range(0, n-i-1):
            # Traverse the array from 0 to n-i-1
            # Swap if the element found is greater than the next element
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Test the bubble_sort function
arr = [20, 30, 50, 40, 10]
print("Original array:", arr)
bubble_sort(arr)
print("Sorted array:", arr)



