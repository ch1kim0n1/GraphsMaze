/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphsmaze;

/**
 *
 * @author skyla
 */
class Maze {
    private int[][] mazeData;
    private int rows;
    private int cols;

    public Maze(int[][] mazeData) {
        this.mazeData = mazeData;
        this.rows = mazeData.length;
        this.cols = mazeData[0].length;
    }

    public boolean hasExit() {
        // Starting from the top left corner, perform a depth-first search to find a valid path to the right column
        boolean[][] visited = new boolean[rows][cols];
        return dfs(0, 0, visited);
    }

    private boolean dfs(int row, int col, boolean[][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || mazeData[row][col] == 0) {
            // Out of bounds, already visited, or blocked by a wall
            return false;
        }

        if (col == cols - 1) {
            // Reached the right column, exit found
            return true;
        }

        visited[row][col] = true;

        // Recursively search in all four directions
        boolean result = dfs(row - 1, col, visited) || // Up
                         dfs(row + 1, col, visited) || // Down
                         dfs(row, col - 1, visited) || // Left
                         dfs(row, col + 1, visited);   // Right

        visited[row][col] = false; // Backtrack

        return result;
    }
}