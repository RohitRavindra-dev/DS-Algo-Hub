# Contains Duplicate – Solution Logic

## Core Idea

- Use a HashSet to track seen values while iterating through the array.
- If a value is already in the set, return `True` (duplicate found).
- If the loop completes with no duplicates, return `False`.

## Pseudocode

```python
initialize empty set
for each value in array:
    if value in set:
        return True
    add value to set
return False
```

## Time Complexity

- **O(n)** – Each element is seen once.

## Space Complexity

- **O(n)** – Due to the extra set for tracking values.

---

## Alternative Approaches

1. **Sorting:**
   - Sort the array, then check consecutive values for duplicates.
   - Time: O(n log n), Space: O(n) or O(1) (if in-place sort).
2. **Brute Force (Double Loop):**
   - Use two pointers to compare every pair of values.
   - Time: O(n²), Space: O(1).
