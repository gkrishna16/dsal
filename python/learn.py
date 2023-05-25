# def bubbleSort(nums):
#     for i in range(len(nums)):
#         for j in range(0, len(nums) - i - 1):
#             if nums[j] > nums[j+1]:
#                 nums[j], nums[j+1] = nums[j+1], nums[j]
#     return nums


# def bubbleSort2(nums):
#     for i in range(len(nums)):
#         swapped = False
#         for j in range(0, len(nums) - i - 1):
#             if nums[j] > nums[j+1]:
#                 nums[j], nums[j+1] = nums[j+1], nums[j]
#                 swapped = True
#         if swapped == False:
#             break
#     return nums

# # Recursive Solution


# def recur_bubbleSort(nums):
#     sorted = True
#     for i in range(0, len(nums) - 1):
#         if nums[i] > nums[i+1]:
#             # swap
#             nums[i], nums[i+1] = nums[i+1], nums[i]
#             sorted = False
#             # now array is not sorted

#     if sorted == False:
#         recur_bubbleSort(nums)
#     return nums


# nums = [5, 4, 3, 2, 1]
# # val = recur_bubbleSort(nums)
# val = bubbleSort(nums)
# print(val)

# def bubbleSort(nums: list) -> list:
#     for i in range(len(nums)):
#         for j in range(0, len(nums) - i - 1):
#             if nums[j] > nums[j + 1]:
#                 nums[j], nums[j+1] = nums[j+1], nums[j]
#     return nums

# def bubbleSort(nums: list) -> list:
#     for i in range(len(nums)):
#         flag: bool = False
#         for j in range(0, len(nums) - i - 1):
#             if nums[j] > nums[j+1]:
#                 nums[j], nums[j+1] = nums[j+1], nums[j]
#                 flag = True

#         if flag == False:
#             break
#     return nums

# // recursive approach


# val = bubbleSort([5, 4, 3, 2, 1, 8, 9])
# print(val)


# def encode_decode(strgs):

# num = 100
# name = 'gopal'

# print(f'You are the man {name}.upper().')

# inp = input('What is your name ?\n')
# numb = input("What is the number ?")
# print(inp)
# print(numb)

# nums = [10, 20, 30, 40]

# for i in range(len(nums) - 1, -1, -1):
#     print(f'{i} - index')
#     print(nums[i])


# def bubbleSort(nums):
#     for i in range(len(nums)):
#         flag = False
#         for j in range(len(nums) - 1):
#             if nums[j] > nums[j+1]:
#                 nums[j], nums[j+1] = nums[j+1], nums[j]
#                 flag = True
#         if flag == False:
#             break
#     return nums


# arr = [4, 3, 25, 1]
# val = bubbleSort(arr)
# print(val)


numbs = [1, 2, 23, 45]
for i, j in enumerate(numbs):
    print(i, j)
