/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphsmaze;

/**
 *
 * @author skyla
 */
public class Maze {
    boolean exitFound = false;
    //int maze[][] = {{1, 0, 1, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 0, 1, 0, 0, 0,1},{0, 1, 1, 1, 1, 1, 1, 1},{0, 1, 0, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 1, 0, 1, 0, 1, 0}};
    void search(int row, int col){
        int r = 0; //check what to do with R
        
        if(row >= && col >= 0 && row < maze.length && col < maze[r].length && maze[row][col] == 1){
            
        }
        if (col == maze[r].length -1){
            exitFound = true;
        }
        else{
            maze[row][col] = 0;
            search(row+1, col);
            search(row-1, col);
            search(row, col+1);
            search(row, col-1);
                maze[row][col] = 1;
        }
      foundcheck();
    }
    
    public String foundcheck(){
        if(exitFound == true){
            return "exit found";
        }
        else{
            return "exit not found";
        }
    }
}
