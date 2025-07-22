class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        arrmax = max(nums)
        currmax = 1
        currmin = 1

        for i in nums:
            temp = currmax * i
            currmax = max({temp, currmin * i, i})
            currmin = min({temp, currmin * i, i})

            arrmax = max(currmax, arrmax)
        return arrmax