/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author vandl4973
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //asking user for number
        System.out.println("Enter a number between 100 and 50");
        //storing the number
        int num = in.nextInt();
        //creating a vairable to count down from
        int start =100;
        //loop to do the counting
        while (num != start){
           
            System.out.println(start);
        if (start == num+4||start == num+3||start == num+2||start == num+1 ){
                break;
                
            }
         start= start-5;
        }
        }
}
