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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = in.nextInt();
        System.out.println("Please enter the intrest rate");
        double r = in.nextDouble();
        System.out.println("Please enter the intial amount");
        double balance = in.nextDouble();
        double balance2 = balance+balance;
        while (balance != 1000000) {
            balance = (r)* balance;
             year = year+1;
           
            if (balance2 == (balance * 2)){
                System.out.println("This year your account doubled "+year);
            }
            if (balance > 1000000) {
                System.out.println("you will hit a million dollars in your bank account this year " +year );
            break;
            }
           
        }
    }
}
