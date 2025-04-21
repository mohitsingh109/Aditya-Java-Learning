# Question: Diagonal Minimum Path in 2D Array

## Context

You are given a 2D grid of integers that represent elevation values in a terrain map. You are tasked with simulating a **diagonal path** through the grid. Starting from a given cell `(row, col)`, the path proceeds step-by-step by selecting the **smaller of the two diagonal neighbors**:

- The cell **down-right**: `(row+1, col+1)`
- The cell **down-left**: `(row+1, col-1)`

At each step, you must choose the diagonal neighbor that has the **smaller value**. The path continues until you reach the **bottom row** of the grid. If only one diagonal neighbor exists (e.g., on the edges), that neighbor must be chosen. All values in the grid are **distinct integers**.

---

## Class Definitions

### `Location.java`

```java
public class Location {
    private int theRow;
    private int theCol;

    public Location(int r, int c) {
        theRow = r;
        theCol = c;
    }

    public int getRow() {
        return theRow;
    }

    public int getCol() {
        return theCol;
    }
}
```

### `DiagonalPath.java`

```java
public class DiagonalPath {
    /** A 2D array of distinct integers initialized in the constructor. */
    private int[][] grid;

    /** Constructs a DiagonalPath object with a given 2D array */
    public DiagonalPath(int[][] g) {
        grid = g;
    }

    /**
     * Returns the Location of the next diagonal cell to move to
     * based on the smaller value between the bottom-left and bottom-right neighbors.
     * 
     * Preconditions:
     * - row is a valid row index but not the last row
     * - col is a valid column index
     */
    public Location getNextDiagonalLoc(int row, int col) {
        /* to be implemented */
    }

    /**
     * Computes and returns the sum of the values along a diagonal path
     * starting at (row, col), moving to the lowest-value diagonal neighbor
     * until the bottom row is reached.
     * 
     * Preconditions:
     * - row is a valid row index but not the last row
     * - col is a valid column index
     */
    public int sumDiagonalPath(int row, int col) {
        /* to be implemented */
    }
}

```

## Example

### Given the following grid:

```
[
  [4, 5, 6, 7],
  [9, 3, 2, 8],
  [1, 10, 0, 6],
  [7, 8, 5, 1]
]
```

And starting at (0, 1) (value 5), the path could be:

(0,1) → 5

Compare (1,0)=9 and (1,2)=2 → choose (1,2)

Compare (2,1)=10 and (2,3)=6 → choose (2,3)

(3,2)=5 → end

Final path sum: 5 → 2 → 6 → 5 = 18

---
### Requirements

- You must use the Location class to return the next coordinates.
- You must not access elements outside the array bounds.
- You must use the helper method getNextDiagonalLoc inside your implementation of sumDiagonalPath.