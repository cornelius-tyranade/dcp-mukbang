from typing import List

class Solution:

    def get_concatenation(self, nums: List[int]) -> List[int]:
        res = []
        nums_size = len(nums)

        for i in range(nums_size):
            res.insert(i, nums[i])
            res.insert(i + nums_size, nums[i])

        return res

    def get_concatenation_2(self, nums: List[int]) -> List[int]:
        nums_size = len(nums)
        res = [0] * (nums_size * 2)

        for i in range(nums_size):
            res[i] = nums[i]
            res[i + nums_size] = nums[i]

        return res

obj = Solution()
print(obj.get_concatenation([1,2,1]))
print(obj.get_concatenation_2([1,2,1]))

