

def merge_sort(arr):
    # Base case: if the length of the array is 1 or less, return the array (since it's already sorted)
    if len(arr) <= 1:
        return arr

    # Split the array into two halves
    mid = len(arr) // 2
    left = arr[:mid]
    right = arr[mid:]

    # Recursively sort the two halves
    left = merge_sort(left)
    right = merge_sort(right)

    # Merge the two sorted halves into a single sorted array
    result = merge(left, right)

    return result

def merge(left, right):
    # Create a result array to store the merged values
    result = []

    # While there are elements in both arrays
    while len(left) > 0 and len(right) > 0:
        # If the current element in the left array is less than the current element in the right array,
        # add it to the result array and remove it from the left array
        if left[0] <= right[0]:
            result.append(left.pop(0))
        # Otherwise, add the current element in the right array to the result array and remove it from the right array
        else:
            result.append(right.pop(0))

    # Add any remaining elements from the left or right arrays to the result array
    result.extend(left)
    result.extend(right)

    return result

# Example usage:
arr = [3, 1, 4, 1, 5, 9, 2, 6]
arr = merge_sort(arr)
print(arr)  # Output: [1, 2, 3, 4, 5, 6, 9]

