/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.graphsmaze;

/**
 *
 * @author skyla
 */
class GaphMaze {
    public static void main(String[] args) {
        // Test case
        int[][] mazeData = {
            {1, 0, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 1, 1, 1},
            {0, 1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 1, 0}
        };

        System.out.println("Test Case:");
        printMaze(mazeData);

        Maze maze = new Maze(mazeData);
        if (maze.hasExit()) {
            System.out.println("Exit found");
        } else {
            System.out.println("Exit not found");
        }
    }

    private static void printMaze(int[][] mazeData) {
        for (int[] row : mazeData) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}