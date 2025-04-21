# Question 2: Zig-Zag Horizontal Path in Grid

## Context

You are given a 2D grid of integers. A zig-zag path starts at the top-left corner and moves:
- Right
- Down-left
- Right
- Down-left  
- ... alternating until the bottom row is reached or movement isn't possible.

---

## Class Definitions

```java
public class ZigZagPath {
    private int[][] grid;

    public ZigZagPath(int[][] g) { grid = g; }

    public Location getNextZigZagLoc(int row, int col, boolean goingRight) {
        /* to be implemented */
    }

    public int sumZigZagPath(int row, int col) {
        /* to be implemented */
    }
}
```

### Example
```
Grid:
[
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

Start: (0,0) → right to (0,1)=2 → down-left to (1,0)=4 → right to (1,1)=5 → ...

