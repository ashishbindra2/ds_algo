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
