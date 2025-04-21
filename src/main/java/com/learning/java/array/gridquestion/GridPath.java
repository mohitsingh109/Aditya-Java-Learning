package com.learning.java.array.gridquestion;

public class GridPath
{
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;


    public GridPath() {
//        int[][] grid = {
//                {12, 3, 4, 13, 5},
//                {11, 21, 2, 14, 16},
//                {7, 8, 9, 15, 0},
//                {10, 17, 20, 19, 1},
//                {18 ,22, 30, 25, 6}
//        };

        int[][] grid = {
                {12, 30, 40, 25, 5},
                {11, 3, 22, 15, 43},
                {7, 2, 9, 4, 0},
                {8, 33, 18, 6, 1}
        };

        this.grid = grid;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col) {

        // to handle only one neighbor case
        boolean isNextNeighborExist = (grid[row].length - 1) != col;  // (4) != 4
        boolean isBelowNeighborExist = (grid.length - 1) != row;

        if(!isNextNeighborExist) {
            return new Location(row + 1, col);
        }

        if(!isBelowNeighborExist) {
            return new Location(row, col + 1);
        }

        //to handle all remaining case
        int neighborNext = grid[row][col + 1];
        int neighborBelow = grid[row + 1][col];

        if(neighborNext < neighborBelow) {
            return new Location(row, col + 1);
        } else {
            return new Location(row + 1, col);
        }
    }
    /**
     * Computes and returns the sum of all values on a path through grid, as described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public int sumPath(int row, int col) {
        int result = grid[row][col];
        int lastRows = grid.length - 1;
        int latColumn = grid[lastRows].length - 1;

        while (lastRows != row || latColumn != col) {
            Location nextLoc = getNextLoc(row, col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
            result += grid[row][col]; // we are updating the sum here
        }

        return result;
    }
}