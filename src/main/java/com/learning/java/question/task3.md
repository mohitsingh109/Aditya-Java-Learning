# Question 3: Max Value Downward Path

## Context

Given a grid of integers, construct a path from a starting cell `(row, col)` moving:
- Down `(row+1, col)`
- Diagonally down-right `(row+1, col+1)`

Choose the **larger** of the two neighbors at each step. The path ends at the bottom row.

---

## Class Definitions

```java
public class MaxPath {
    private int[][] grid;

    public MaxPath(int[][] g) { grid = g; }

    public Location getNextMaxLoc(int row, int col) {
        /* to be implemented */
    }

    public int computeMaxPathSum(int row, int col) {
        /* to be implemented */
    }
}
```

## Example
```
Grid:
[
  [5, 3, 1],
  [4, 8, 6],
  [7, 2, 9]
]

```
Start: (0,0) → choose max of (1,0)=4 and (1,1)=8 → go to (1,1), etc.

---