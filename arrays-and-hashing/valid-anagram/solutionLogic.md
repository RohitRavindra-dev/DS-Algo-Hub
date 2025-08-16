# Valid Anagram – Solution Logic

## Core Idea

- Use a fixed-size integer array (length 26) to count the frequency of each character in both strings.
- Increment the count for each character in `s` and decrement for each character in `t`.
- If all counts are zero at the end, the strings are anagrams.

## Pseudocode

```python
if length of s != length of t:
    return False

initialize count[26] = {0}
for i in 0 to length of s - 1:
    count[s[i] - 'a'] += 1
    count[t[i] - 'a'] -= 1

for c in count:
    if c != 0:
        return False
return True
```

## Time Complexity

- **O(n)** – where n is the length of the strings (single pass through both strings).

## Space Complexity

- **O(1)** – uses a fixed-size array (26 for lowercase English letters).

---

## Alternative Approaches

1. **Sorting:**
   - Sort both strings and compare them.
   - Time: O(n log n), Space: O(n) (if not sorting in-place).
2. **HashMap:**
   - Use a HashMap to count characters in both strings.
   - Time: O(n), Space: O(1) (since only 26 possible characters).
