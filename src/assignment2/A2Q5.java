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
public class A2Q5 {

    public String binaryConvert(int n) {
        //checking if we're done
        if (n == 0 || n == 1) {
            return "" + n;
        }
//checking for remainders
        int r = n % 2;
        if (r == 0) {
            //rounding number up
            Math.ceil(n);
            return binaryConvert(n / 2) + "0";
        } else {
            Math.ceil(n);
            //if the number has a remainder
            return binaryConvert(n / 2) + "1";
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        A2Q5 test = new A2Q5();
        System.out.println("num");
        int ask = in.nextInt();
        String n = test.binaryConvert(ask);
        System.out.println(n);
    }
}
