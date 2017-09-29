/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

public class MazeSolver {

    public void printmaze(char[][] maze) {
        //loop through all the rows
        for (int i = 0; i < maze.length; i++) {
            //go through row
            for (int j = 0; j < maze[i].length; j++) {
                //printing current location
                System.out.print(maze[i][j]);
            }
            // move to next line for printing
            System.out.println("");
        }
    }

    public boolean solvemaze(char[][] maze, int row, int col) {
       
        // am i off the map 
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) {
            return false;
        }
         //did i find the end 
        if (maze[row][col] == 'e') {
            printmaze(maze);
            return true;
        }
        //is this a bad spot?
        if (maze[row][col] == '+' || maze[row][col] == 'w') {
         return false;   
        }
        //i'm on a valid spot
        //mark ive been here
        maze[row][col] = '+';
        //check north
        boolean check = solvemaze(maze,row-1,col);
        //did it work
        if (check){
            return true;
        }
        //check east
        check= solvemaze(maze,row,col+1);
        //did it work
        if (check){
            return true;
        }
        //check south
        check= solvemaze(maze,row+1,col);
        //did it work
        if (check){
            return true;
        }
        //check west
        check= solvemaze(maze,row,col-1);
        //did it work
        if (check){
            return true;
        }
        //this spot not woke
        //unmoving
        maze[row][col]='.';
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //char[][] maze = new char[10][10];
        char[][] maze = {
            {'w', 'w', 'w', 'w', 'w', 'w'},
            {'s', '.', 'w', '.', '.', '.'},
            {'w', '.', 'w', '.', 'w', '.'},
            {'w', '.', '.', '.', 'w', '.'},
            {'w', 'w', 'w', 'w', 'w', 'e'}
        };
        MazeSolver test = new MazeSolver();
        test.printmaze(maze);
        test.solvemaze(maze, 1, 0);
    }
}
