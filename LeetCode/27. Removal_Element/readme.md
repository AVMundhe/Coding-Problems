# Remove Duplicates from Sorted Array (Java)

## Problem Statement
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.  
The relative order of the elements should be kept the same.  

Return the number of unique elements (`k`).  
- Modify the array `nums` so that the first `k` elements contain the unique elements in order.  
- The values beyond index `k` do not matter.  

---

## Examples

**Example 1:**  
Input:  nums = [1,1,2]  
Output: 2, nums = [1,2,_]  

**Example 2:**  
Input:  nums = [0,0,1,1,1,2,2,3,3,4]  
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]  

---

## Approach (Explanation of Code)

1. **Initialization**  
   - `k` → index where the next unique element will be placed.  
   - `c` → keeps track of the last unique element seen (initialized to `Integer.MIN_VALUE`).  

2. **Traversal**  
   - Loop through all elements in `nums`.  
   - If the current element `nums[i]` is **different** from `c`, it means it’s unique.  
   - Place it at index `k` (`nums[k++] = nums[i]`) and update `c = nums[i]`.  

3. **End Result**  
   - The first `k` elements of `nums` are unique and sorted.  
   - Return `k` (number of unique elements).  

---
Complexity Analysis

Time Complexity: O(n) – iterate through the array once.

Space Complexity: O(1) – no extra space used apart from variables.

## Code
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int c = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != c) {
                nums[k++] = nums[i];
                c = nums[i];
            }
        }
        return k;
    }
}
