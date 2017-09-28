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
public class A2Q4 {

    public int hailstone(int n) {
        //checking base cases
        Scanner out = new Scanner(System.in);
        if (n == 0 || n == 1) {
            return 1;
        }
        //check ing if its odd or even
        double a = (n % 2);
        
        if (a == 0) {
            //showing the numbers
            System.out.println(n);
            //if it even
            return hailstone(n / 2);
        } else {
            //showing the numbers
            System.out.println(n);
            //if its odd
            return hailstone(3 * n + 1);
            
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        A2Q4 test = new A2Q4();
        System.out.println("num");
        int ask = in.nextInt();
        int n = test.hailstone(ask);
        System.out.println(n);
    }
}
