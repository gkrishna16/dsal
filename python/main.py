def quickSort(nums, left, right):
    # so that the function returns once left and right are the same numbers
    if left >= right:
        return

    pivot = nums[(left + right)//2]
    index = partition(nums, left, right, pivot)

    quickSort(nums, left, index - 1)
    quickSort(nums, index, right)


def partition(nums, left, right, pivot):
    while left <= right:
        while nums[left] < pivot:
            left += 1
        while nums[right] > pivot:
            right -= 1
        if left <= right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1

    return left


nums = [9, 8, 7, 6]
quickSort(nums, 0, len(nums) - 1)

print("Gopal")

for i in range(len(nums)):
    print(nums[i])
