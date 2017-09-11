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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating a scanner
        Scanner in = new Scanner(System.in);
        //creating an array
        double[] Num = new double[3];
        System.out.println("Please enter three numbers");
        Num[0] = in.nextDouble();
        Num[1] = in.nextDouble();
        Num[2] = in.nextDouble();
        //filled the array
        //multiplying the numbers in the array
        double multiply =  Num[0]* Num[1]* Num[2];
        System.out.println("The Product multiplied ");
        System.out.println(multiply);
        //squaring the number
        System.out.println("The Product squared");
        System.out.println(Math.pow(multiply, 2)); 
        //square rooting the number
        System.out.println("The Product square rooted");
        System.out.println(Math.sqrt(multiply));
    }
}
