from typing import List


class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seenNums = set()
        for num in nums:
            if num in seenNums:
                return True
            seenNums.add(num)
        return False
    

mySolution = Solution()
print(mySolution.hasDuplicate([1, 2, 3, 4]))  # Output: False
print(mySolution.hasDuplicate([1, 2, 3, 1]))  # Output: True