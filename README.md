# 🔄 Rotate Array – LeetCode Problem #189

## 📖 Problem Statement
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

---


## 🎯 Handling Edge Cases
Let’s say we have an array of size `n = 7`. If we rotate the array `k = 7` times, we end up with the original array.  

To optimize this, we use the **Modulo Operator**.  

For example:  
If `k = 10`, then  
k = k % n
k = 10 % 7 = 3

So instead of rotating the array 10 times, we only need to rotate it 3 times to get the desired result.

---

## 💡 Approach / Solution Overview
To solve this problem efficiently, I used the **Array Reversal Technique**:
Step - 1 : Reverse the entire given array.
Step - 2 : Reverse the array from 0th index upto (k-1)th index.
Step - 3 : Reverse the array from kth index upto (n-1)th index.

---

This allows us to rotate the array in-place with **O(1) extra space**.
## ⏱️ Complexity Analysis
- **Time Complexity:** O(n) – Each element is reversed twice.  
- **Space Complexity:** O(1) – In-place rotation without extra storage.  
