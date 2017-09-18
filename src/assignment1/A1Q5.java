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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        
        
        for (int i =0; i<=num; i++){
         for ( int m =0; m<=num; m++){
            System.out.print("*");
          
        }
            System.out.println("");
        }
           

    }
}


