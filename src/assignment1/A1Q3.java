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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double Tickets = 35;
        double total = 0;
        //creating vairables to store the total expenses
        System.out.println("Enter expenses for food");
        total += in.nextDouble();
        System.out.println("Enter expenses for DJ");
        total += in.nextDouble();
        System.out.println("Enter expenses for hall rental");
        total += in.nextDouble();
        System.out.println("Enter expenses for decorations");
        total += in.nextDouble();
        System.out.println("Enter expenses for staff");
        total += in.nextDouble();
        System.out.println("Enter expenses for miscellaneous expenses");
        total += in.nextDouble();
        //total ticket sales
        double need = Math.ceil(total/Tickets);        
        System.out.println("You need to sell "+need+ " to break even" );
    }   
}
