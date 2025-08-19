# 24. Swap Nodes in Pairs (Java)

## Problem Statement
Given a linked list, swap every two adjacent nodes and return its head.  
You must solve the problem without modifying the values in the list’s nodes (only node pointers may be changed).

---

## Examples

**Example 1:**  
Input:  head = [1,2,3,4]  
Output: [2,1,4,3]  

**Example 2:**  
Input:  head = []  
Output: []  

**Example 3:**  
Input:  head = [1]  
Output: [1]  

**Example 4:**  
Input:  head = [1,2,3]  
Output: [2,1,3]  

---

## Approach (Explanation of Code)

1. **Base Condition:**  
   - If the list is empty (`head == null`) or has only one node (`head.next == null`), return `head` because no swap is possible.

2. **Initialize Pointers:**  
   - `ret` → stores the new head of the linked list (which will be the second node after the first swap).  
   - `prev` → keeps track of the previous node to connect swapped pairs.  
   - `temp` → temporarily holds the next pair’s starting node.

3. **Swapping Logic (inside while loop):**  
   - Store the node after the current pair in `temp`.  
   - Reverse the current pair by pointing `head.next.next` to `head`.  
   - Point `head.next` to `temp` (next pair start).  
   - Move `head` forward to `temp` for the next iteration.  
   - Update `prev.next` to connect the previously swapped pair with the new one.

4. **Repeat until all possible pairs are swapped.**

---

## Complexity Analysis

-Time Complexity: O(n) – each node is visited once.

-Space Complexity: O(1) – constant extra space is used.

## Code
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode temp;
        ListNode ret;
        ListNode prev = head;
        
        if (head == null || head.next == null) {
            return head;     
        } else {
            ret = head.next;
        }
        
        while (head != null && head.next != null) {
            prev = head;
            temp = head.next.next;
            head.next.next = head;
            head.next = temp;
            head = temp;
            
            if (head != null && head.next != null) {
                prev.next = head.next;
            }
        }
        return ret;
    }
}
