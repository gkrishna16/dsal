class Sol:
    def insertionSort(self, nums):
        for i in range(len(nums)):
            j = i
            while j > 0 and nums[j - 1] > nums[j]:
                temp = nums[j]
                nums[j] = nums[j-1]
                nums[j-1] = temp
                j -= 1
                
        return nums
                

sol = Sol()
#print(sol.insertionSort([5,4,3,2,1]))


nums = [4,3,2,1]
for i in range(len(nums)-1, -1, -1):
    print(nums[i])
    
    
print("-------------------------")
    
for i in reversed(nums):
    print(i)

