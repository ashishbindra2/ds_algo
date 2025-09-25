## 1. Contains Duplicate (Easy)
https://neetcode.io/problems/duplicate-integer?list=neetcode150

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

My solution
```py
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        new = set(nums)
        if len(nums) == len(new):
            return False
        return True

```
