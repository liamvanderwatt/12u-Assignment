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
public class A2Q2 {

    public int digitalsum(int num) {
        //check if were done 
        if (num == 0) {
            return num;
        } else {
            //finding the last digit add it to the sum and then removing the last digit
            num = num % 10 + digitalsum(num / 10);
            return (num % 10) + digitalsum(num / 10);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        A2Q2 test = new A2Q2();
        System.out.println("num");
        int ask = in.nextInt();
        int num = test.digitalsum(ask);
        System.out.println(num);
    }
}
