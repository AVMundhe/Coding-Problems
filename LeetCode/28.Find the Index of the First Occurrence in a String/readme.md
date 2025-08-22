# Find the Index of the First Occurrence in a String (Java)

## Problem Statement
Given two strings `haystack` and `needle`, return the index of the **first occurrence** of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## Examples

**Example 1:**  
Input:  haystack = "sadbutsad", needle = "sad"  
Output: 0  
Explanation: "sad" occurs at index 0 and 6, but the first occurrence is at index 0.  

**Example 2:**  
Input:  haystack = "leetcode", needle = "leeto"  
Output: -1  
Explanation: "leeto" did not occur in "leetcode".  

---

## Approach (Explanation of Code)

1. **Initialize Pointers**  
   - `i` → traverses `haystack`.  
   - `j` → traverses `needle`.  
   - `k` → stores the starting index of the current comparison.  

2. **Outer Loop**  
   - Iterate `i` through `haystack`.  
   - For each position `i`, try to match the substring `needle`.  

3. **Inner Loop**  
   - Compare characters `haystack.charAt(i)` and `needle.charAt(j)`.  
   - If they match, increment both `i` and `j`.  
   - If mismatch happens, reset `i` to `k+1` and `j` to 0 (start matching again from the next position).  

4. **Check for Full Match**  
   - If `j == needle.length()`, return `k` (start index of match).  

5. **No Match Found**  
   - If the loop finishes without finding a match, return `-1`.  

---

Complexity Analysis

Time Complexity: O(n * m)

n = length of haystack, m = length of needle.

Worst case: every mismatch requires re-checking.

Space Complexity: O(1)

Only a few variables are used, no extra data structures.

## Code
```java
class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < haystack.length()) {
            k = i;
            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return k;
            }
            i = k + 1;
            j = 0;
        }
        return -1;
    }
}
