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
public class A2Q1 {

    public int digitalSum(int num) {     
     //check if where done 
     if  (num == 0){
          return 0;
      } else{
         //finding the last digit add it to the sum and then removing the last digit
       return (num % 10) + digitalSum(num / 10);
     }  
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
         A2Q1 test = new A2Q1();
         System.out.println("Please enter a number");
         int ask = in.nextInt();
         int num = test.digitalSum(ask);
         System.out.println(num);
    }
}
