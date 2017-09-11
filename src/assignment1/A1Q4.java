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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int Num =in.nextInt();
        if (Num == 10){
            System.out.println("**********");
        }else if (Num ==9){
            System.out.println("*********");
        }else if (Num ==8){
            System.out.println("********");
        }else if (Num ==7){
            System.out.println("*******");
        }else if (Num ==6){
            System.out.println("******");
        }else if (Num ==5){
            System.out.println("*****");
        }else if (Num ==4){
            System.out.println("****");
        }else if (Num ==3){
            System.out.println("***");
        }else if (Num ==2){
            System.out.println("**");
        }else if (Num ==1){
            System.out.println("*");
        }
            
    }
}
