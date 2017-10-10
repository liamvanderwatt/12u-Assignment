/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author vandl4973
 */
public class A2Q3 {

    public int triangle(int n ) {
        
        // check if we are done
        if (n == 0){ 
            return 0;
        }         
        //checking if we are done
        return n + triangle(n-1); 
        
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        A2Q3 test = new A2Q3();
        System.out.println("num");
        int n = in.nextInt();
        int row = test.triangle(n);
        System.out.println(row);
    }
}
