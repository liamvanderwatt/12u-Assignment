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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int store = 0;
        //asking user for ten words
        System.out.println("please enter 10 words");
        //an array that stores the vairables
        String words[] = new String[10];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word " + i + " Please");
            words[i] = in.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            store = store + words[i].length();
        }
        double avg = store / 10;
        System.out.println("The word average is " + avg);
    }
}
