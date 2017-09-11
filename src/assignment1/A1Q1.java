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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //new vairable to store name
        String Name;
        //ask person to enter name.
        System.out.println("Enter your name pls");
        Name = in.next();
        System.out.println("Hello " +Name);
    }
}
