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
```py
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False
```
```py
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums)) < len(nums)
```
```py
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return True
        return False
```
```
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False
```
```java
import java.io.*;
import java.lang.*;
 
class Solution{
    
    public boolean containsDuplicate(int[] nums) {
 
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public static void main (String[] args) {
	    
	    Solution sol = new Solution();
	    
	    int nums[]= {1, 2, 3, 1};
	    
	    boolean res = sol.containsDuplicate(nums);
	    
	    // printing the result
	    System.out.println(res);
    }
}
```

2. Valid Anagram (Easy)
   Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

```py
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1,d2 = {},{}

        for _ in s:
            d1[_] = d1.get(_,0) + 1
        for _ in t:
            d2[_] = d2.get(_,0) + 1
        if d1 == d2:
            return True
        return False
```

```py
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS, countT = {}, {}

        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)
        return countS == countT
```

```py
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ns = len(s)
        if ns!= len(t):
            return False

        d1,d2 = {},{}

        for _ in range(ns):
            d1[s[_]] = d1.get(s[_],0) + 1
            d2[t[_]] = d2.get(t[_],0) + 1
        return d1 == d2
```

```py
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False

        return sorted(s) == sorted(t)
```
3. Two Sum (Easy)
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
Constraints:

2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000

```py
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}  # val -> index

        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i
```
```py
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []
```

## 189. Rotate Array (Medium)

link: https://leetcode.com/problems/rotate-array/submissions/1802408923/ 

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 
```
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100
```

solution

```py
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = k % len(nums)
        while k:
            t = nums.pop()
            nums.insert(0,t)
            k = k - 1
        return nums
```
