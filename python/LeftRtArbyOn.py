def leftRotateArr(nums):
    temp = nums[0]
    for i in range(len(nums) - 1):
        nums[i] = nums[i + 1]
    nums[len(nums) - 1] = temp

    return nums


val = leftRotateArr([5, 4, 3, 2])
print(val)
