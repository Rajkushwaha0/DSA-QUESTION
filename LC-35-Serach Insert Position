class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        s=0
        e=len(nums)-1
        mid=s+(e-s)//2
        while(s<=e):
            if(nums[mid]==target):
                return mid
            elif(target>nums[mid]):
                s=mid+1
                    
            else:
                e=mid-1
            mid=s+(e-s)//2
        return s



//
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if(target in nums):
            return nums.index(target)
        if(target > max(nums)):
            l1=len(nums)
            return l1
        for i in range(0,len(nums)):
                if(nums[i]<target and target < max(nums)):
                    continue
                else:
                    c=i
                    break
        return c
