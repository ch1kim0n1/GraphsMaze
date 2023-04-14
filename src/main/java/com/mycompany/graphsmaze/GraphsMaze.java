/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.graphsmaze;

/**
 *
 * @author skyla
 */
public class GraphsMaze {

    public static void main(String[] args) {
        Maze maze = new Maze();
        
        //print out the maze
        int mazed[][] = {{1, 0, 1, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 0, 1, 0, 0, 0,1},{0, 1, 1, 1, 1, 1, 1, 1},{0, 1, 0, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 1, 0, 1, 0, 1, 0}};
        maze.search(5, 5); // no output here
        System.out.println(maze.foundcheck()); //boolean if exit was found
    }
}
