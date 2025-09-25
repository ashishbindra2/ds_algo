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
